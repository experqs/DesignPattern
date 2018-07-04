package behavioral.observer;

/**
 * Observer：观察者类，是被观察者发生变化时的待通知对象
 */
public interface Observer {

    // 另：Observer观察者类及其子类还可以定义一个Subject实例作为成员变量、并在构造函数中传入并设值，
    // 则在使用时，对多个观察者实例可传入同一个Subject实例（传入的是Subject实例的引用），当Subject实例变化时，每个观察者都可以获取变化情况
    //	Subject subject;

    Double THRESHOLD_LEVEL_ONE = 5.0;    // 设置一级熔断阈值
    Double THRESHOLD_LEVEL_TWO = 7.0;    // 设置二级熔断阈值

    // 观察者收到通知后所做出的反应动作
    void action(Double percent);

}
