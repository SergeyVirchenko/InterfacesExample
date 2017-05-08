package generics.wildcards;

/**
 * Created by Sergey on 05-May-17.
 */
public class Stats<T extends Number> {
    T[] nums;

    public Stats(T[] o) {
        nums = o;
    }

    public double average() {
        double sum = 0d;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

//    public boolean sameAvg(Stats<T> ob) {
//        return average() == ob.average();
//    }

    public boolean sameAvg(Stats<?> ob) {
        return average() == ob.average();
    }
}
