package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Sergey on 08-May-17.
 */
public class IOJavaScheme {
    public static void main(String[] args) {
        try {
            // создание потокового объекта (открытие потока)
            FileWriter out = new FileWriter("/java/textt.docx");
            // придание потоковому объекту требуемых свойств
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw = new PrintWriter(br);
            // работа с потоком через потоковый объект
            pw.println("I'm a sentence in a text-file.");
            // закрытие потока
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
