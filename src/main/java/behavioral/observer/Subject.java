package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//Subject类：某个待观察的目标主题/产品
public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();	//所有的观察者列表
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notice(this.value);			//当待观察的目标主题发生变化后，通知所有的观察者做出反应
    }

    public List<Observer> getList() {
        return observerList;
    }

//    public void setObserverList(List<Observer> observerList) {
//        this.observerList = observerList;
//    }

    public void addObserver(Observer obs){	//添加一个观察者
        observerList.add(obs);
    }

    public void delObserver(Observer obs){	//删除某个观察者
        observerList.remove(obs);
    }

    public void notice(int targetValue){
        for (Observer obs : observerList){	//另外，各个观察者的反应动作可考虑多线程并行执行，特别是反应动作内有阻塞等；此处简化为串行执行
            obs.action(targetValue);
        }
    }
}
