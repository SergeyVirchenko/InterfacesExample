package convert;

import java.io.*;

/**
 * Created by Sergey on 09-May-17.
 */
public class Convert {
    public static void main(String[] args) {
        String[] arr = read().split("    ");
        StringBuilder b = new StringBuilder();

        for (int i = 1; i < arr.length; i++) {
            String[] ar = arr[i].split("\t");
            b.append("@Expose\n").append("@SerializedName(\"" + ar[0] + "\")\n");
            b.append("public ");
            switch (ar[1]) {
                case "int":
                    b.append("int ");
                    break;
                case "date":
                case "string":
                    b.append("String ");
                    break;
                case "float":
                    b.append("float ");
                    break;
                case "bool":
                    b.append("boolean ");
                    break;
                default:
                    b.append("Object ");
                    break;
            }
            b.append(ar[0]).append(";\n\n");
        }

        write(b.toString());
    }

    static String read() {
        try {
            FileReader fr = new FileReader("D:\\in.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            StringBuilder b = new StringBuilder();
            while ((s = br.readLine()) != null) {
                b.append(s);
            }
            fr.close();
            return b.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    static void write(String source) {
        byte buf[] = source.getBytes();

        // Use try-with-resources to close the files.
        try (FileOutputStream f0 = new FileOutputStream("D:\\out.txt")) {
            f0.write(buf);
        } catch (IOException e) {
            System.out.println("An I/O Error Occured");
        }
    }
}
