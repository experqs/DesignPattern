package behavioral.state;

/**
 * 具有某种状态的具体目标类
 * 这里以股票作为例子
 */
public class Stock {

    private Integer lossYears;  // 连续亏损年份
    private State state;        // 股票当前状态

    public Integer getLossYears() {
        return lossYears;
    }

    public void setLossYears(Integer lossYears) {
        this.lossYears = lossYears;
    }

    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }

    public void change() {
        // 把来自客户端的请求都转发到对应状态的处理方法中（会因this.state状态值的不同而指向不同的实际状态对象）
        state.handle(this);
    }
}
