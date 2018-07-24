package behavioral.state;

/**
 * 股票状态为：正常状态
 * 状态转换条件：当正常股票连续两年亏损时，则下一个状态转为ST；否则保持当前状态
 */
public class StateNormal implements State {

    @Override
    public void handle(Stock stock) {
        System.out.print("此前股票状态为【正常】...");
        if (stock.getLossYears() < 2) {
            stock.setState(new StateNormal());
            if (stock.getLossYears() == 0) {
                System.out.println("这次为盈利，下一状态继续为【正常】...");
            } else {
                System.out.println("上次盈利后这次首次亏损，下一状态继续为【正常】...");
            }
        } else {
            stock.setState(new StateST());
            System.out.println("连续两年亏损，因此下一状态转为【ST】...");
        }
    }

}
