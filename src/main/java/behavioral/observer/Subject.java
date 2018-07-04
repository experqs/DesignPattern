package behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Subject类：某个待观察的目标主题/产品
 */
public class Subject {

    private List<Observer> observerList = new ArrayList();    //所有的观察者列表
    private Double percent;

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
        // 当待观察的目标主题发生变化后，通知所有的观察者做出反应
        notice(this.percent);
    }

    public List<Observer> getList() {
        return observerList;
    }

    public void setList(List<Observer> list) {
        this.observerList = list;
    }

    // 添加一个观察者
    public void addObserver(Observer obs) {
        if (!observerList.contains(obs)) {
            observerList.add(obs);
        }
    }

    // 删除某个观察者
    public void delObserver(Observer obs) {
        if (observerList.contains(obs)) {
            observerList.remove(obs);
        }
    }

    /**
     * 使用多线程来并行通知各个观察者做出反应动作（尤其是反应动作内有阻塞、Http请求等时不要使用串行通知）
     * 也可视场景考虑使用消息队列来通知
     * @param percent
     */
    public void notice(Double percent) {
        // 设置最大线程数
        int threadMax = observerList.size() > 8 ? 8 : observerList.size();
        // 定长线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(threadMax);
        for (Observer obs : observerList) {
            // 多线程并行通知各个观察者
            threadPool.submit(() -> {
                obs.action(percent);
            });
        }
        // 显式关闭线程池，不再接受新任务
        threadPool.shutdown();
        try {
            // 视场景需要，主线程（本notice()方法）等待子线程全部结束之后再结束
            while (!threadPool.awaitTermination(10, TimeUnit.MILLISECONDS)) {
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
