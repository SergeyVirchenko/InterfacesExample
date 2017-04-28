package generics.lairs;

/**
 * Created by Sergey on 28-Apr-17.
 */
public class Lair {
    // Житель
    Object inhabitant;

    public void setInhabitant(Object inhabitant) {
        this.inhabitant = inhabitant;
    }

    public Object getInhabitant() {
        return this.inhabitant;
    }

    public static <T> void setIfNull(T t) {
    }
}
