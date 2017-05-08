package generics.extention4;

/**
 * Created by Sergey on 05-May-17.
 */
public class EGen2<T> extends EGen<T> {

    public EGen2(T o) {
        super(o);
    }

    //переопределение метода обобщенного класса
    @Override
    public T getOb() {
        return ob;
    }
}
