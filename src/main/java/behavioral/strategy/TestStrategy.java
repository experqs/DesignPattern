package behavioral.strategy;

/**
 * 策略模式（Strategy Pattern），用一个接口Strategy把一系列相似的算法封装起来（即各种算法都实现同一个接口），在使用时使它们可相互替换。
 * 主要解决：在有多种算法相似的情况下，使用 if...else... 所带来的复杂和难以维护。
 * 优点： 1、算法可以自由切换； 2、避免使用多重条件判断； 3、扩展性良好。
 * 缺点： 1、策略类会增多； 2、所有策略类都需要对外暴露。
 *
 * Strategy接口把一系列相似的算法/策略封装起来。
 * Context 是一个使用了某种策略的类，传入Strategy的某个策略实现类的实例并调用该实例的方法。
 */
public class TestStrategy {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyAdd());         // 设置策略为加法
        System.out.println(context.getStrategy().getClass() + " 策略运算结果为：" + context.doOperation(10, 2));

        context.setStrategy(new StrategySubtract());    // 切换为减法，切换后的代码无需修改（仍然调用doOperation()方法）
        System.out.println(context.getStrategy().getClass() + " 策略运算结果为：" + context.doOperation(10, 2));

        context.setStrategy(new StrategyMultiply());    // 切换为乘法
        System.out.println(context.getStrategy().getClass() + " 策略运算结果为：" + context.doOperation(10, 2));
    }

}
