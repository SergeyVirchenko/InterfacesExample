package generics.lairs;

/**
 * Created by Sergey on 28-Apr-17.
 */
public class DoubleLair<INHABITANT, BEAST> {
    // Житель
    INHABITANT inhabitant;
    BEAST beast;

    public BEAST getBeast() {
        return beast;
    }

    public void setBeast(BEAST beast) {
        this.beast = beast;
    }

    public void setInhabitant(INHABITANT inhabitant) {
        this.inhabitant = inhabitant;
    }

    public INHABITANT getInhabitant() {
        return this.inhabitant;
    }
}
