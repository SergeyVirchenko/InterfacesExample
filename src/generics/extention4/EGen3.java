package generics.extention4;

/**
 * Created by Sergey on 05-May-17.
 */
public class EGen3<T, V> extends EGen<T> {
    V ob2;

    public EGen3(T o, V ob2) {
        super(o);
        this.ob2 = ob2;
    }

    public V getOb2() {
        return ob2;
    }
}
