package behavioral.template;

/**
 * 父类模板的一个具体实现类ClassSonA
 */
public class ClassSonA extends ClassFather {

    @Override
    protected void functionSon() {
        System.out.println("正在执行子类ClassSonA实现的方法...");
    }

}
