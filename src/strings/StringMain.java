package strings;

/**
 * Created by Sergey on 10-Apr-17.
 */
public class StringMain {
    public static void main(String[] args) {
        String a = "Aasdasd";
        String sA = "a";
        System.out.println(a.substring(0,0));
        a.equals(sA);//false
        a.equalsIgnoreCase(sA);//true
    }
}
