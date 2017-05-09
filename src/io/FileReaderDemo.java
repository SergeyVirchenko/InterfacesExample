package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Sergey on 08-May-17.
 */
public class FileReaderDemo {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("D:\\Work\\Projects\\Test\\src\\io\\FileReaderDemo.java");
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
