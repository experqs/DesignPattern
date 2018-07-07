package creational.simpleFactory;

import behavioral.strategy.Strategy;
import behavioral.strategy.StrategyAdd;
import behavioral.strategy.StrategyMultiply;
import behavioral.strategy.StrategySubtract;

/**
 * 产生 运算功能 的工厂，复用了策略模式 behavioral.strategy 的运算类
 */
public class OperationFactory {
    public static Strategy createOperate(String operate){	//静态方法，用“类名.静态方法”即可直接使用
        Strategy operation = null;
        switch(operate){
            case "+":
                operation = new StrategyAdd();
                break;
            case "-":
                operation = new StrategySubtract();
                break;
            case "*":
                operation = new StrategyMultiply();
                break;
        }
        return operation;
    }
}
