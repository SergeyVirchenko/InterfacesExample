package generics.boundedwildcards;

/**
 * Created by Sergey on 05-May-17.
 */
public class Cords<T extends TwoD> {
    T[] arrCords;

    public Cords(T[] cords) {
        this.arrCords = cords;
    }

    //вывести X Y координаты всех элементов массива
    public static void showXY(Cords<?> arg) {
        for (int i = 0; i < arg.arrCords.length; i++) {
            System.out.println(arg.arrCords[i].x + " " + arg.arrCords[i].y);
        }
    }

    public static void showXYZ(Cords<? extends ThreeD> c) {
        for (int i = 0; i < c.arrCords.length; i++) {
            System.out.println(c.arrCords[i].x + " " + c.arrCords[i].y + " " + c.arrCords[i].z);
        }
    }

    public static void showAll(Cords<? extends FourD> c) {
        for (int i = 0; i < c.arrCords.length; i++) {
            System.out.println(c.arrCords[i].x + " " + c.arrCords[i].y + " " + c.arrCords[i].z + " " + c.arrCords[i].t);
        }
    }
}
