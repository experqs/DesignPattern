package structural.proxy;

/**
 * 实际类
 */
public class RealSubject implements Subject {

    @Override
    public void operate() {
        System.out.println("这是来自 " + this.toString() + " 的操作。");
    }

}
