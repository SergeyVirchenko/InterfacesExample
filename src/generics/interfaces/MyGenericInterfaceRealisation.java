package generics.interfaces;

/**
 * Created by Sergey on 05-May-17.
 */
public class MyGenericInterfaceRealisation<T extends Comparable<T>> implements MinMax<T> {

    T[] vals;

    public MyGenericInterfaceRealisation(T[] o) {
        vals = o;
    }

    @Override
    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}
