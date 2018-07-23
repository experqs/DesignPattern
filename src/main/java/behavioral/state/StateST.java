package behavioral.state;

/**
 * 股票状态为：ST
 * 状态转换条件：当股票转亏为盈时，其状态即转为正常；当股票连续三年亏损时，其状态转为*ST
 */
public class StateST implements State {

    @Override
    public void handle(Stock stock) {
        System.out.print("当前股票状态为 ST...");
        if (stock.getLossYears() == 0) {
            stock.setState(new StateNormal());
            System.out.println("设置下一状态为 正常...");
        } else if (stock.getLossYears() == 3) {
            stock.setState(new StateStarST());
            System.out.println("设置下一状态为 *ST...");
        } else {
            System.out.println("不存在这种情况！");
        }
    }

}
