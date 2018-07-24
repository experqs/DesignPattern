package behavioral.state;

/**
 * 状态模式（State Pattern），当一个对象的内在状态改变时，允许改变其行为。
 * 当一个对象状态的转换比较复杂、有较多的if-else条件分支语句时，可以使用状态模式。状态模式可以较方便地新增状态和转换。
 *
 * 上下文环境(Context)：具有一个状态属性（持有一个抽象状态实例，可用各个具体状态代换），且其状态不同则行为不同。
 * 			对于来自客户端的与状态相关的操作请求，都把 自身context对象（即this）转发给当前所持有的状态实例来处理。
 * 		   （这里以 Stock类 作为例子）
 * 抽象状态(State)角色：定义一个接口，封装了 context对象的所有状态所对应的行为。
 * 具体状态(ConcreteState)角色：每一个具体状态类都接收传入的context对象，完成了该context的该状态所对应的操作，并按需设置context的下一个状态。
 *
 */
public class TestState {

    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.setState(new StateNormal());  // 股票状态初始化为正常
        stock.setLossYears(0);              // 连续不盈利的年数初始化为0

        // 模拟经营20年，每年结算一次盈亏情况
        for (int i = 0; i < 20; i++) {
            double random = Math.random() - 0.5;    // 产生 [-0.5,0.5) 之间的随机浮点数，正负概率均为一半
            // 模拟：正数表示盈利，非正数表示不盈利
            if (random > 0) {
                stock.setLossYears(0);
            } else {
                stock.setLossYears(stock.getLossYears() + 1);
            }
            stock.change();
        }
    }

}
