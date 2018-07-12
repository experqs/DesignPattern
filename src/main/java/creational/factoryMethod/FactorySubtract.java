package creational.factoryMethod;

import behavioral.strategy.Strategy;
import behavioral.strategy.StrategySubtract;

/**
 * 减法工厂，复用了策略模式 behavioral.strategy 的运算类
 */
public class FactorySubtract implements Factory {

    @Override
    public Strategy createOperate() {
        return new StrategySubtract();
    }

}
