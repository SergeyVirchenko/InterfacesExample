package maps;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Sergey on 24-Apr-17.
 */
public class App {
    static HashMap<String, String> mapField = new HashMap<>();

    public static int sort(String a, String b){
        return 0;
    }
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        Collections.sort(new ArrayList<String>(), App::sort);

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


//        HashMap<String, String> map = new HashMap<>();
//        map.put("a", "a");
//        mapField.putAll(map);
//
//        mapField.putAll(new HashMap<String, String>() {
//            {
//                put("a", "a");
//            }
//        });
    }

    private static final Map<Integer, String> myMap = new HashMap<Integer, String>();

    static {
        myMap.put(1, "one");
        myMap.put(2, "two");
    }


    private static final Map<Integer, String> myMap2 = new HashMap<Integer, String>() {
        {
            put(1, "one");
            put(2, "two");
        }
    };

    private static final Map<String, String> EXTENSION_TO_MIMETYPE =
            Arrays.stream(new String[][]{
                    {"txt", "text/plain"}, //
                    {"html", "text/html"}, //
                    {"js", "application/javascript"}, //
                    {"css", "text/css"}, //
                    {"xml", "application/xml"}, //
                    {"png", "image/png"}, //
                    {"gif", "image/gif"}, //
                    {"jpg", "image/jpeg"}, //
                    {"jpeg", "image/jpeg"}, //
                    {"svg", "image/svg+xml"}, //
            }).collect(Collectors.toMap(kv -> kv[0], kv -> kv[1]));


}
