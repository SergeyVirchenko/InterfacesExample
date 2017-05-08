package generics.extention4;

import generics.extention4.EGen;
import generics.extention4.EGen2;

/**
 * Created by Sergey on 05-May-17.
 */
public class InstanceOfDemo {

    public static void demo() {
        // создать объект типа EGen для целых чисел
        EGen<Integer> iOb = new EGen<Integer>(88);
        // создать объект типа EGen для целых чисел
        EGen2<Integer> iOb2 = new EGen2<Integer>(99);
        // создать объект типа EGen2 для символьных строк
        EGen2<String> strOb2 = new EGen2<String>("Tecт обобщений");
        // проверить, является ли объект iOb2 какой-нибудь
        // из форм класса EGen2
        if (iOb2 instanceof EGen2<?>)
            System.out.println("Объект iOb2 я вляется экземпяром класса EGen2");
        // проверить , является ли объект iОb2 какой-нибудь
        // из форм класса EGen
        if (iOb2 instanceof EGen<?>)
            System.out.println("Объект iOb2 является экземпляром класса EGen");
        System.out.println();
        // проверить, является ли strOb2 объектом класса EGen2
        if (strOb2 instanceof EGen2<?>)
            System.out.println("Объект strOb2 является экземпляром класса EGen2");
        // проверить , является ли strOb2 объектом класса EGen
        if (strOb2 instanceof EGen<?>)
            System.out.println("Объект strOb2 является экземпляром класса EGen");
        System.out.println();
        // проверить, является ли iОb экземпляром класса EGen2,
        // что совсем не так
        if (iOb instanceof EGen2<?>)
            System.out.println("Объект iOb является экземпляром класса EGen2");
        //проверить, является ли iOb экземпляром класса EGen, что так и есть
        if (iOb instanceof EGen<?>) {
            System.out.println("Объект iOb является экземпляром класса EGen");
        }

        //следующий тип не скомпилируется так как сведения об обобщенном типе отсутствует во вермя выполнения
        //if (iOb2 instanceof EGen2<Integer>) {
//        }
    }
}
