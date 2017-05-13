package assertation;

/**
 * Created by Sergey on 12-May-17.
 */
public class AssertDemo {
    static int val = 3;

    // Return an integer.
    static int getnum() {
        return val--;
    }

    public static void main(String args[]) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getnum();

            assert n > 0:"ALARM"; // произойдет сбой, если n О

            System.out.println("n is " + n);
        }
    }

}
