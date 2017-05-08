package generics.interfaces;

/**
 * Created by Sergey on 05-May-17.
 */
public interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}
