package generics.boundedwildcards;

/**
 * Created by Sergey on 05-May-17.
 */
public class FourD extends ThreeD {
    protected int t;

    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}
