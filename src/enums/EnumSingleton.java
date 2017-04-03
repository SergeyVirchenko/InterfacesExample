package enums;

/**
 * Created by Sergey on 03-Apr-17.
 */
public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }


}
