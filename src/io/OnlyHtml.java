package io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Sergey on 08-May-17.
 */
public class OnlyHtml implements FilenameFilter {

    String ext;

    public OnlyHtml(String ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }

}
