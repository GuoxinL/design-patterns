package pub.guoxin.design;

/**
 * Created by guoxin on 17-9-13.
 */
public abstract class AbstractCalculator {

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int ints[] = new int[2];
        ints[0] = Integer.parseInt(array[0]);
        ints[1] = Integer.parseInt(array[1]);
        return ints;
    }
}
