package creational.singleton;

/**
 * 单例模式（Singleton Pattern）
 * 单例是指在整个应用程序执行期间，一个类只有唯一的一个实例对象。
 *
 * 关键代码：构造方法设为私有；自行实例化一个对象，并对外提供这个单一实例的访问方法。
 *
 * 根据此单一实例产生的时机不同，单例模式可以分为两种：饿汉式（静态变量直接初始化为实例对象）、懒汉式（等到第一次使用时再实例化）。
 *
 */
public class TestSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }

}
