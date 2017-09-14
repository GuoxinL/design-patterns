package pub.guoxin.design;

/**
 * 模板方法模式
 *
 * Created by guoxin on 17-9-14.
 */
public class StrategyApplication {

    /**
     * 解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，可以是
     * 抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，
     * 实现对子类的调用，
     * @param args
     */
    public static void main(String[] args) {
        String exp = "8+8";

        AbstractCalculator calculator = new Plus();
        int calculate = calculator.calculate(exp, "\\+");
        System.out.println(calculate);
    }
}
