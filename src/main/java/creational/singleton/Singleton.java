package creational.singleton;

/**
 * 懒汉式、线程安全的单例
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // 双重检查
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
