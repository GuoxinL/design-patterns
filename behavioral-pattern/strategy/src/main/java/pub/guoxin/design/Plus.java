package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-13.
 */
public class Plus extends AbstractCalculator implements Calculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\+");
        return arrayInt[0] + arrayInt[1];
    }
}
