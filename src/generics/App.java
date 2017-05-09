package generics;

import generics.beasts.Goblin;
import generics.beasts.Troll;
import generics.interfaces.MyGenericInterfaceRealisation;
import generics.method.GenMethDemo;
import generics.lairs.Lair;
import generics.lairs.LairTyped;
import generics.lairs.UpperBoundLair;
import generics.wildcards.Stats;
import loop.MyClass;

/**
 * Created by Sergey on 28-Apr-17.
 */
public class App {

    public static void main(String[] args) {
        wildCardDemo();
    }


    public static void genericInterfaceDemo() {
        Integer nums[] = {1, 2, 3, 4, 5};
        Character chs[] = {'b', 'r', 'p', 'w'};

        MyGenericInterfaceRealisation<Integer> iob = new MyGenericInterfaceRealisation(nums);
        MyGenericInterfaceRealisation<Character> cob = new MyGenericInterfaceRealisation(chs);
    }

    public static void genericMethodDemo() {
        Integer nums[] = {1, 2, 3, 4, 5};
        if (GenMethDemo.isIn(2, nums)) {
            System.out.println("2 contains in " + nums);
        }

        if (!GenMethDemo.isIn(7, nums)) {
            System.out.println("7 does not contains in " + nums);
        }

        String strs[] = {"one", "two", "three", "four", "five"};

        if (GenMethDemo.isIn("two", strs)) {
            System.out.println("two contains in " + strs);
        }

        if (!GenMethDemo.isIn("six", strs)) {
            System.out.println("six does not contains in " + nums);
        }
//          Не скомпилируется!
//        if (!GenMethDemo.isIn(6, strs)) {
//            System.out.println("six does not contains in " + nums);
//        }
    }

    public static void wildCardDemo() {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("Average iob = " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("Average dob = " + w);

        Float fnums[] = {1f, 2f, 3f, 4f, 5f};
        Stats<Float> fob = new Stats<>(fnums);
        double x = fob.average();
        System.out.println("Average fob = " + x);

        System.out.println("Average of iob and dob are " + (iob.sameAvg(dob) ? "same" : "dif"));
        System.out.println("Average of iob and fob are " + (iob.sameAvg(fob) ? "same" : "dif"));
    }


    public static void lairTest() {
        Lair lair = new Lair();
        // указываем жителя.
        lair.setInhabitant(new Troll());
        // Нужно явное приведение типа!
        Goblin goblin = (Goblin) lair.getInhabitant();

        LairTyped<Goblin> goblinLair = new LairTyped<>();
        goblinLair.setInhabitant(new Goblin());
        Goblin ggoblin = goblinLair.getInhabitant();

        LairTyped<Troll> trollLair = new LairTyped<>();
        trollLair.setInhabitant(new Troll());
        Troll ttroll = trollLair.getInhabitant();


//        LairTyped.<Troll>setIfNull(lairTyped, new Goblin()); compile error
//        LairTyped.<Goblin>setIfNull(lairTyped, new Goblin());


        LairTyped lairTyped1 = new LairTyped();
        lairTyped1.setInhabitant(new Goblin());

//        lairTyped = lairTyped1;

        //Upperbound
//        UpperBoundLair<Troll> goblinLair = new UpperBoundLair<>();
//        goblinLair.setInhabitant(new Goblin());
//        goblinLair.tick();

//        goblinLair.test(goblinLair);
    }

    public static <T> LairTyped<T> maxx(T x, T y) {
        return null;
    }
}
