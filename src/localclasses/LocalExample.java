package localclasses;

/**
 * Created by Sergey on 31-Mar-17.
 */
public class LocalExample {

    private String field = "field";

    public void foo() {
        int i = 1;
        m(i, "", "");
    }

    public void m(int i, String arg1, final String arg2) {
        String localMethodArg = "localArg";
        final String finalLocalArg = "localArg";
//        arg1 = ";";

        class LocalClass {

            private String localField = "localField";

            public void localMethod() {
                field = new String("asd");
                arg1.charAt(0);
                arg2.charAt(0);
//                localMethodArg = "";
                finalLocalArg.charAt(0);
            }
        }

        LocalClass lc = new LocalClass();
        lc.localMethod();
    }
}
