package generics.boundedwildcards;

/**
 * Created by Sergey on 05-May-17.
 */
public class ThreeD extends TwoD {
    protected int z;

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
