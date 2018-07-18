package structural.adapter;

/**
 * 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式。
 * 适配器不是在初始设计时添加的，而是解决正在服役的项目的问题（如果不是很有必要，可以不使用适配器，而是直接对系统进行重构）。
 *
 * Target：客户端所期待的接口
 * Adaptee：需要进行适配的原有的类
 * TargetAdapter：实现Target接口，并在内部包装一个Adaptee对象，把源接口转换成目标接口（把Target接口的请求转发给Adaptee对象来处理）
 */
public class TestAdapter {

    public static void main(String[] args) {
        Target target = new TargetAdapter();
        target.newMethod();
    }

}
