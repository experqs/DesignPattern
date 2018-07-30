package structural.facade;

/**
 * 对外提供的门面类/外观类
 */
public class Facade {

    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade() {
        systemA = new SystemA();
        systemB = new SystemB();
        systemC = new SystemC();
    }

    public void methodOne() {
        systemA.methodA();
        systemB.methodB();
        systemC.methodC();
    }

    public void methodTwo() {
        systemB.methodB();
        systemC.methodC();
    }

}
