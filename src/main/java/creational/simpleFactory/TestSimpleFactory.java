package creational.simpleFactory;

/**
 * 简单工厂模式（SimpleFactory Pattern）
 * 工厂模式 提供了一种创建对象的方式：用一个单独的类来完成创造实例的工作，不会对客户端暴露创建过程逻辑，并且通过使用一个共同的接入点来指向新创建的对象。
 *
 * 简单工厂：在工厂类包含了必要的逻辑判断，根据客户端的选择条件动态地实例化相关类。缺点：若想新增运算，需要增加运算类、再修改工厂类。
 *
 */
public class TestSimpleFactory {

    public static void main(String[] args) {
        System.out.println("10 + 3 = " + OperationFactory.createOperate("+").doOperation(10, 3));
        System.out.println("10 - 3 = " + OperationFactory.createOperate("-").doOperation(10, 3));
        System.out.println("10 * 3 = " + OperationFactory.createOperate("*").doOperation(10, 3));
    }

}
