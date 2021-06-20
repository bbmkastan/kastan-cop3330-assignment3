package ex43.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteGenerator {
    public boolean makeWebsiteFolder(String siteName, String filePath) {
        // make new file with filePath+siteName
        File folder = new File(filePath + siteName);
        // bool = make dir
        boolean bool = folder.mkdir();
        // if(bool) return true, else return false
        if(folder.exists()) {
            return true;
        }
        return false;
    }

    public boolean makeHTMLFile(String siteName, String filePath ,String authorName) throws IOException {
        // make new file inside the folder with the siteName
        File file = new File(filePath + siteName + "/" + "index.html");
        // create writer instance for file
        FileWriter writer = new FileWriter(file);
        // write inside the file
        writer.write("<title>" + siteName + "</title>\n");
        writer.write("<meta name= \"Author\" content=\"" + authorName + "\" />\n");
        // close writer
        writer.close();
        // bool file.createNewFile()
        boolean bool = file.exists();
        // if(bool) return true, else return false
        if(bool) {
            return true;
        }
        return false;
    }

    public boolean makeJSFolder(String siteName, String filePath) {
        // make new file with siteName +"js"
        File folder = new File(filePath + siteName + "/" + "js");
        boolean bool = folder.mkdir();
        // if(bool) return true, else return false
        if(folder.exists()) {
            return true;
        }
        return false;
    }

    public boolean makeCSSFolder(String siteName, String filePath) {
        // make new file with siteName+"css"
        File folder = new File(filePath + siteName + "/" + "css");
        boolean bool = folder.mkdir();
        // if(bool) return true, else return false
        if(folder.exists()) {
            return true;
        }
        return false;
    }
}
