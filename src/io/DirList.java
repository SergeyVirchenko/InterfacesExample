package io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Sergey on 08-May-17.
 */
public class DirList {

    public static void dirListOnly() {
        String dirname = "/java";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyHtml("txt");
        String s[] = f1.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }


    public static void main(String args[]) {
        dirListOnly();

//        String dirname = "/java";
//        File f1 = new File(dirname);
//
//        if (f1.isDirectory()) {
//            System.out.println("Directory of " + dirname);
//            String s[] = f1.list();
//
//            for (int i = 0; i < s.length; i++) {
//                File f = new File(dirname + "/" + s[i]);
//                if (f.isDirectory()) {
//                    System.out.println(s[i] + " is a directory");
//                } else {
//                    System.out.println(s[i] + " is a file");
//                }
//            }
//        } else {
//            System.out.println(dirname + " is not a directory");
//        }
    }

}
