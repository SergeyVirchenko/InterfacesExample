package enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class EnumMain {

    public static void main(String args[]) {
        enumEquals();
        Random r = new Random();
        Apple[] arr = new Apple[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = Apple.values()[r.nextInt(Apple.values().length)];
        }
    }

    public static void firstExample() {
        Apple ap;

        ap = Apple.RedDel;

        // Output an enum value.
        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        // Compare two enum values.
        if (ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel.\n");

        // Use an enum to control a switch statement.
        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;
        }
    }

    public static void secondExample() {
        Apple ap;

        System.out.println("Here are all Apple constants");

        // values()- возвращает массив , содержащий список констант перечисления
        for (Apple a : Apple.values())
            System.out.println(a);

        System.out.println();

        // valueOf( String Строка )- возвращает значение если есть такое в перечислении
        ap = Apple.valueOf("Winesap");

        System.out.println("ap contains " + ap + " " + ap.getPrice());
    }

    public static void thirdExample() {
        Apple ap;
        // Display price of Winesap.
        System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents.\n");

        // Display all apples and prices.
        System.out.println("All apple prices:");
        for (Apple a : Apple.values())
            System.out.println(a + " costs " + a.getPrice() + " cents.");

    }

    public static void ordinal() {
        // ordinal()-возвращает позицию константы в списке констант перечисления
        System.out.println("Here are all apple constants" + " and their ordinal values: ");
        for (Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal());

    }

    public static void enumEquals() {
        Apple ap, ap2, ap3;

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " comes before " + ap2);

        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " comes before " + ap);

        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals " + ap3);

        System.out.println();

        if (ap.equals(ap2))
            System.out.println("Error!");

        if (ap.equals(ap3))
            System.out.println(ap + " equals " + ap3);

        if (ap == ap3)
            System.out.println(ap + " == " + ap3);


    }


}
