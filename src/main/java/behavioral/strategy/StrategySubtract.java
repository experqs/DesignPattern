package behavioral.strategy;

/**
 * 减法策略实现类
 */
public class StrategySubtract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }

}
