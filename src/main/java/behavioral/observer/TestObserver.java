package behavioral.observer;

/**
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象。
 * 观察者模式属于行为型模式。在界面设计中应用广泛。
 *
 * 关键代码：在待观察的目标主题类里有一个 ArrayList 存放观察者们，当目标主题发生变化时，通知观察者们执行动作。
 *
 * 另，Java的API已提供了现成的Observer接口Java.util.Observer。可直接使用（须继承 Java.util.Observer才能真正使用）：
 * 提供Add/Delete observer的方法； 提供通知(notice) 所有observer的方法。
 *
 */
public class TestObserver {

    public static void main(String[] args) {
        Subject sub = new Subject();
        Observer obs1 = new ObserverA();
        Observer obs2 = new ObserverB();

        // 添加观察者
        sub.addObserver(obs1);
        sub.addObserver(obs2);

        // 当目标发生变化时，会通知到已添加的观察者们
        sub.setPercent(-3.0);
        sub.setPercent(-5.0);
        sub.setPercent(-7.0);
    }

}
