package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by Sergey on 21-Apr-17.
 */
public class App {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<A> arrayList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(new A(r.nextInt(10)));
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<A>() {
            @Override
            public int compare(A left, A right) {
                return right.i - left.i;
            }
        });

        System.out.println(arrayList);
    }
}
