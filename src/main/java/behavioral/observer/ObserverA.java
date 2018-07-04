package behavioral.observer;

/**
 * 观察者的某个实现类A
 */
public class ObserverA implements Observer {

    @Override
    public void action(Double percent){
        System.out.println(this + " 已接收到当前涨跌幅度为：" + percent);
        if (Math.abs(percent) >= THRESHOLD_LEVEL_ONE && Math.abs(percent) < THRESHOLD_LEVEL_TWO) {
            System.out.println(this + " 已触发5%的熔断阈值，暂停交易15分钟！");
        }
    }

}
