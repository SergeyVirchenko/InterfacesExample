package loop;

/**
 * Created by Sergey on 31-Mar-17.
 */
public class Main {
    int i = 0;

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            myClass.addInterfaceRealization(new MyInterface() {
                @Override
                public void interfaceMethod() {
                    System.out.println("Anonymous realization № " + finalI);
                }
            });
            System.out.println("Cycle iteration № " + i);
        }

        myClass.runListLoop();
    }
}
