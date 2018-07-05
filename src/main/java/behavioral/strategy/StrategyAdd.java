package behavioral.strategy;

/**
 * 加法策略实现类
 */
public class StrategyAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

}
