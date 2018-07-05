package behavioral.strategy;

/**
 * 持有一个实际Strategy实例对象（即Strategy某个策略实现类的实例）的引用，并调用该实例对应的算法方法
 */
public class Context {

    private Strategy strategy;

    public Context(){}

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return this.strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doOperation(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}
