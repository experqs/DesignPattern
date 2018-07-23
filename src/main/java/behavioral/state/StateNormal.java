package behavioral.state;

/**
 * 股票状态为：正常状态
 * 状态转换条件：当股票连续两年亏损时，则下一个状态转为ST；否则保持当前状态
 */
public class StateNormal implements State {

    @Override
    public void handle(Stock stock) {
        System.out.print("当前股票状态为 正常...");
        if (stock.getLossYears() < 2) {
            stock.setState(new StateNormal());
            System.out.println("设置下一状态为 正常...");
        } else {
            stock.setState(new StateST());
            System.out.println("设置下一状态为 ST...");
        }
    }

}
