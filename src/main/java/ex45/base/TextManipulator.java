package ex45.base;

import classes_used_in_multiple_packages.FileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TextManipulator {
    public boolean generateNewFile(String path, String content) throws IOException {
        // make new file inside the folder with the siteName
        File file = new File(path);
        // create writer instance for file
        FileWriter writer = new FileWriter(path);
        // write inside the file
        writer.write(content);
        // close writer
        writer.close();
        // if(bool) return true, else return false
        if(file.exists()) {
            return true;
        }
        return false;
    }

    public String replaceUtilizeWithUse(String path) throws Exception {
        // create instance of FileReader
        FileReader fileReader = new FileReader();
        fileReader.setFilePath(path);
        ArrayList<String> text = fileReader.getStrings();
        // turn array list to string
        String newText = getStringFromArrayList(text);
        // Split String with utilize as the splitter
        String[] array = newText.split("utilize");
        newText = "";
        //put string back together with use instead of utilize
        int i = 0;
        for (; i < array.length - 1; ++i) {
            newText += array[i] + "use";
        }
        newText += array[i];

        return newText;
    }

    public String getStringFromArrayList(ArrayList<String> text) {
        String newText = "";
        for (int i = 0; i < text.size(); i++) {
            newText += text.get(i) + "\n";
        }
        return newText;
    }
}
