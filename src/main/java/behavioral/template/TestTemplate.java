package behavioral.template;

/**
 * 模板模式/模板方法模式（Template Pattern），定义了一个类的算法骨架/模板，而将一些步骤延迟到子类中实现。
 * 模板方法使得子类可以不改变一个算法的结构即可重定义该算法中的某些特定步骤。
 *
 * 作用：1、封装不变部分（在父类），扩展可变部分（在子类）。3、行为由父类控制，子类实现。
 *
 * 为防止恶意操作，一般在父类的模板方法都加上 final 关键词。而需要在子类实现的方法，在父类中用protected限制，
 * 这点与策略模式（用public）不同。
 */
public class TestTemplate {

    public static void main(String[] args) {

        ClassFather someone;

        someone = new ClassSonA();	// 指向一个ClassSonA对象
        someone.templateMethod();	// 调用父类的模版方法，该方法的某个步骤调用了ClassSonA的实现

        System.out.println("--------------------");

        someone = new ClassSonB();	// 指向一个ClassSonB对象
        someone.templateMethod();	// 仍然是调用父类的模版方法，但这次方法的某个步骤切换成ClassSonB的实现

    }

}
