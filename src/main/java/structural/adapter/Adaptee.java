package structural.adapter;

/**
 * 原接口/原实现类
 */
public class Adaptee {

    public Integer oldMethod() {
        Integer priceUSD = (int)(Math.random()*100);
        System.out.println("产生的USD价格 = " + priceUSD);
        return priceUSD;
    }

}
