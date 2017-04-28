package generics.lairs;

import generics.beasts.Monster;

import java.util.List;

/**
 * Created by Sergey on 28-Apr-17.
 */
public class LairTyped<INHABITANT> {

    // Житель
    INHABITANT inhabitant;

    public void setInhabitant(INHABITANT inhabitant) {
        this.inhabitant = inhabitant;
    }

    public INHABITANT getInhabitant() {
        return this.inhabitant;
    }

    public static <T> void setIfNull(LairTyped<? extends Monster> lair, T t) {
        if (lair.getInhabitant() == null) {
//            lair.setInhabitant(t);
        }


    }

}
