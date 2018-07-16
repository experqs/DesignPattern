package structural.proxy;

/**
 * 代理模式（Proxy Pattern），使用一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。同时在代理类中可以为访问实际类提供一些控制。
 *
 * 关键代码：代理类与实际类都实现了同一个接口；代理类使用一个成员变量接收了实际类的一个实例，并进行相关操作
 *
 */
public class TestProxy {

    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.operate();
    }

}
