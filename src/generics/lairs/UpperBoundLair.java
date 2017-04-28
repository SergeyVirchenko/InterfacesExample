package generics.lairs;

import generics.beasts.Monster;

/**
 * Created by Sergey on 28-Apr-17.
 */
public class UpperBoundLair<T extends Monster> {

    T inhabitant;

    public void test(UpperBoundLair<T> lair) {

    }

    public void setInhabitant(T inhabitant) {
        this.inhabitant = inhabitant;
    }

    public T getInhabitant() {
        return this.inhabitant;
    }

    public void tick() {
        if (inhabitant != null) {
            // Можно вызывать методы
            // интерфейса или класса,
            // указанного в качестве верхней
            // границы параметра типа.
            inhabitant.doSomething();
        }
    }
}
