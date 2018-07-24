package behavioral.state;

/**
 * 股票状态为：*ST
 * 状态转换条件：为了简化处理，这里约定：当*ST股票扭亏为盈时，其状态即转为正常；当*ST股票继续亏损时，其状态保持为*ST
 */
public class StateStarST implements State {

    @Override
    public void handle(Stock stock) {
        System.out.print("此前股票状态为【*ST 】...");
        if (stock.getLossYears() == 0) {
            stock.setState(new StateNormal());
            System.out.println("这次扭亏为盈，因此下一状态转为【正常】...");
        } else {
            stock.setState(new StateStarST());
            System.out.println("这次继续亏损，因此下一状态继续为【*ST】...");
        }
    }

}
