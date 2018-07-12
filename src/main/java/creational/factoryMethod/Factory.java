package creational.factoryMethod;

import behavioral.strategy.Strategy;

/**
 * 工厂类接口，复用了策略模式 behavioral.strategy 的运算类
 */
public interface Factory {

    Strategy createOperate();

}
