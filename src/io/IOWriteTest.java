package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Sergey on 08-May-17.
 */
public class IOWriteTest {
    public static void main(String args[]) {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";
        byte buf[] = source.getBytes();

        // Use try-with-resources to close the files.
        try (FileOutputStream f0 = new FileOutputStream("/java/file1.txt");
             FileOutputStream f1 = new FileOutputStream("/java/file2.txt");
             FileOutputStream f2 = new FileOutputStream("/java/file3.txt")) {

            // write to first file
            for (int i = 0; i < buf.length; i += 2) f0.write(buf[i]);

            // write to second file
            f1.write(buf);

            // write to third file
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("An I/O Error Occured");
        }
    }

}
