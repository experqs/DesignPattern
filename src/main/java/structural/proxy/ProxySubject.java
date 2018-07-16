package structural.proxy;

/**
 * 代理类
 */
public class ProxySubject implements Subject {

    RealSubject realSub;

    @Override
    public void operate() {
        // 可以加入对来自客户端的访问者进行权限控制等其它额外功能，这里条件暂由 1 == 1 代替
        if (1 == 1) {
            if (realSub == null) {
                realSub = new RealSubject();
            }
            realSub.operate();
        } else {
            System.out.println("无权限或其它情况");
        }
    }

}
