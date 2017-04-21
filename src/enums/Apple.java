package enums;

/**
 * Created by Sergey on 03-Apr-17.
 */
public enum Apple {
    Jonathan(10),
    GoldenDel(9),
    RedDel(11),
    Winesap(15),
    Cortland(8);

    private int price; // price of each apple

    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }

}
