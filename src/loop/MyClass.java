package loop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 31-Mar-17.
 */
public class MyClass implements MyInterface{

    private List<MyInterface> myInterfaceList = new ArrayList<>();

    public void addInterfaceRealization(MyInterface realization) {
        myInterfaceList.add(realization);
    }

    public void runListLoop() {
        for (MyInterface myInterface : myInterfaceList) {
            myInterface.interfaceMethod();
        }

        myInterfaceList.get(1).interfaceMethod();
    }

    @Override
    public void interfaceMethod() {

    }
}
