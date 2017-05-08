package generics.extention4;

/**
 * Created by Sergey on 05-May-17.
 */
public class EGen<T> {
    T ob;

    public EGen(T o) {
        ob = o;
    }

    public T getOb() {
        return ob;
    }
}
