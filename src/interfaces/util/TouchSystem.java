package interfaces.util;

/**
 * Created by Sergey on 27-Mar-17.
 */
public class TouchSystem {

    public void setClickListener(IClickable clickListener) {
        this.clickListener = clickListener;
    }

    private IClickable clickListener;

    public void onSystemClickEvent() {
        if (clickListener != null) {
            clickListener.onClick();
        }
    }
}
