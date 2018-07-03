package behavioral.observer;

public class ObserverA extends Observer {

    @Override
    public void action(int targetValue){
        System.out.println("ObserverA已接收到目标的变化为：" + targetValue + "，正在做出反应动作A……");
    }

}
