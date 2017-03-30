package interfaces.util;

/**
 * Created by Sergey on 27-Mar-17.
 */
public class View implements IClickable {

    @Override
    public void onClick() {
        System.out.println("OnClick in View");
    }
}
