package structural.facade;

/**
 * 外观模式/门面模式（Facade Pattern），属于结构型模式。比较基础的模式，即使没听过也可能在不知不觉中已使用。
 *
 * 外观模式为各个子系统的调用统一提供了一个外观类访问层Facade，客户端通过调用Facade来间接调用子系统。
 *
 * 优点：降低客户端与多个子系统的耦合性和复杂度，简化接口，提高灵活性
 * 缺点：由于门面类Facade在应用时通常只有一个实例（单例），若需增改功能则较麻烦，不符合开闭原则
 */
public class TestFacade {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodOne();
        System.out.println("---------------------------");
        facade.methodTwo();
    }

}
