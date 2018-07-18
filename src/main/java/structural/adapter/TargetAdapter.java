package structural.adapter;

/**
 * 所需的新接口的实现
 */
public class TargetAdapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public Double newMethod() {
        // 可以根据目标对原有功能进行适配改造
        Integer priceUSD = adaptee.oldMethod();
        Double priceCNY = priceUSD * 6.5;
        System.out.println("转换得到的CNY价格 = " + priceCNY);
        return priceCNY;
    }

}
