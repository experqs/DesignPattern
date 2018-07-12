package creational.factoryMethod;

import behavioral.strategy.Strategy;
import behavioral.strategy.StrategyMultiply;

/**
 * 乘法工厂，复用了策略模式 behavioral.strategy 的运算类
 */
public class FactoryMultiply implements Factory {

    @Override
    public Strategy createOperate() {
        return new StrategyMultiply();
    }

}
