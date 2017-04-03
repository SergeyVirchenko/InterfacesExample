package enums;

/**
 * Created by Sergey on 03-Apr-17.
 */
public enum Apple {
    Jonathan(10) {
        {
            System.out.print("isWarms " + hasWorms());
        }

        @Override
        public boolean hasWorms() {
            return false;
        }
    },
    GoldenDel(9) {
        @Override
        public boolean hasWorms() {
            return false;
        }
    },
    RedDel {
        @Override
        public boolean hasWorms() {
            return false;
        }
    },
    Winesap(15) {
        @Override
        public boolean hasWorms() {
            return false;
        }
    },
    Cortland(8) {
        @Override
        public boolean hasWorms() {
            return false;
        }
    };

    public int price; // price of each apple

    // Constructor
    public abstract boolean hasWorms();

    Apple() {

    }

    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }

}
