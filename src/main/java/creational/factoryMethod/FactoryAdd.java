package creational.factoryMethod;

import behavioral.strategy.Strategy;
import behavioral.strategy.StrategyAdd;

/**
 * 加法工厂，复用了策略模式 behavioral.strategy 的运算类
 */
public class FactoryAdd implements Factory {

    @Override
    public Strategy createOperate() {
        return new StrategyAdd();
    }

}
