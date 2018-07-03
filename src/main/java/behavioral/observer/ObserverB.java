package behavioral.observer;

public class ObserverB extends Observer {

    @Override
    public void action(int targetValue){
        System.out.println("ObserverB已接收到目标的变化为：" + targetValue + "，正在做出反应动作B……");
    }

}
