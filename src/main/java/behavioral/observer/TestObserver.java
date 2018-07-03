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
        Subject s1 = new Subject();
        Observer obs1 = new ObserverA();
        Observer obs2 = new ObserverB();

        s1.addObserver(obs1);
        s1.addObserver(obs2);

        s1.setValue(99);
        s1.setValue(100);
    }

}
