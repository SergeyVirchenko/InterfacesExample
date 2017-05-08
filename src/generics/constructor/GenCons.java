package generics.constructor;

/**
 * Created by Sergey on 05-May-17.
 */
public class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }
}
