package collections;

/**
 * Created by Sergey on 21-Apr-17.
 */
public class A implements Comparable<A> {

    public int i;

    public A(int i) {
        this.i = i;
    }

    @Override
    public int compareTo(A o) {
        return i - o.i;
    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }
}
