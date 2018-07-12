package creational.factoryMethod;

/**
 * 工厂方法模式（FactoryMethod Pattern），定义一个总的工厂接口（或抽象工厂类），再根据各个功能类来创建工厂子类以实现这个工厂接口。
 * 与简单工厂模式相比，工厂方法 使一个功能类的实例化延迟到工厂子类，由工厂子类决定实例化哪一个功能类（然后客户端再判断实例化哪个工厂子类）。
 *
 * 简单工厂模式：在工厂类包含了必要的逻辑判断，根据客户端的选择条件动态地实例化相关类。缺点：若想新增运算，需要增加运算类、再修改工厂类。
 *
 * 对于工厂方法模式，若想新增功能，需要增加运算类、新增对应的工厂子类（无需修改原有的工厂类和子类）。
 * 其实是把逻辑判断（例如实例化哪个类）移到客户端这边来处理了。
 *
 * （本设计模式复用了策略模式 behavioral.strategy 的运算类）
 */
public class TestFactoryMethod {
    public static void main(String[] args) {

        // 屏蔽产品的具体实现，调用者只关心产品的接口；由于各运算功能都是实现了该接口，故若需修改运算功能，operateFactory对象也无需修改
        Factory operateFactory;

        int result;

        operateFactory = new FactoryAdd();
        result = operateFactory.createOperate().doOperation(10, 3);	//给result赋值
        System.out.println("10 + 3 = " + result);

        // 当调整功能（运算）时，仅需修改此处的实例化，而后续操作的代码（如给result赋值）无需修改
        operateFactory = new FactorySubtract();
        result = operateFactory.createOperate().doOperation(10, 3);	//给result赋值
        System.out.println("10 - 3 = " + result);

        operateFactory = new FactoryMultiply();
        result = operateFactory.createOperate().doOperation(10, 3);	//给result赋值
        System.out.println("10 * 3 = " + result);
    }

}
