package wrappers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 03-Apr-17.
 */
public class WrapperMain {
    public static void main(String args[]) {

        Integer a = new Integer(1);
        Integer b = new Integer(1);

        ArrayList<String> list = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        ll.addAll(list);

//        System.out.println(a == b);
//        System.out.println(a.equals(b));

        Integer aa = 128;// -128 to 127
        Integer bb = 128;

        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));

//        Integer iOb = 100; // autobox an int
//
//        int i = iOb; // auto-unbox
//
//        System.out.println(i + " " + iOb);  // displays 100 100
    }

}
