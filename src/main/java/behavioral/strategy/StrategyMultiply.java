package behavioral.strategy;

/**
 * 乘法策略实现类
 */
public class StrategyMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

}