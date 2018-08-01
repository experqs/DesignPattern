package behavioral.template;

/**
 * 抽象类，定义了算法或流程的整体骨架（即模板）
 */
public abstract class ClassFather {

    // 把需要子类来实现的方法定义为protected，而不是public，利于封装权限及子类实现
    protected abstract void functionSon();

    public final void templateMethod() {
        // 在父类中执行公共的代码...
        System.out.println("正在执行父类中的公共代码...");
        // 在父类中指定某个位置执行 已推迟到子类来实现的方法（具体的子类可以有不同的实现）
        functionSon();
    }

}
