package generics;

import generics.beasts.Goblin;
import generics.beasts.Troll;
import generics.lairs.Lair;
import generics.lairs.LairTyped;
import generics.lairs.UpperBoundLair;

/**
 * Created by Sergey on 28-Apr-17.
 */
public class App {

    public static void main(String[] args) {
        Lair lair = new Lair();
        // указываем жителя.
        lair.setInhabitant(new Goblin());
        // Нужно явное приведение типа!
        Goblin goblin = (Goblin) lair.getInhabitant();

        LairTyped<Goblin> lairTyped = new LairTyped<>();
        lairTyped.setInhabitant(new Goblin());
//        LairTyped.<Troll>setIfNull(lairTyped, new Goblin()); compile error
        LairTyped.<Goblin>setIfNull(lairTyped, new Goblin());

        Goblin ggoblin = lairTyped.getInhabitant();

        LairTyped lairTyped1 = new LairTyped();
        lairTyped1.setInhabitant(new Goblin());

        lairTyped = lairTyped1;

        //Upperbound
        UpperBoundLair<Troll> goblinLair = new UpperBoundLair<>();
//        goblinLair.setInhabitant(new Goblin());
        goblinLair.tick();

        goblinLair.test(goblinLair);

        goblinLair = maxx(new Troll(), new Troll());
    }

    public static <T> LairTyped<T> maxx(T x, T y) {
        return null;
    }
}
