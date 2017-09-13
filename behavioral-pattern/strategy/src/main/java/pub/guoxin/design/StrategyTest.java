package pub.guoxin.design;

/**
 * 策略模式
 * <p>
 * Created by guoxin on 17-9-13.
 */
public class StrategyTest {

    /**
     * 策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对
     * 各种算法做封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用
     * 哪个算法即可。
     *
     * @param args
     */
    public static void main(String[] args) {
        String exp = "2+8";
        Calculator calculator = new Plus();
        int result = calculator.calculate(exp);
        System.out.println(result);
    }
}
