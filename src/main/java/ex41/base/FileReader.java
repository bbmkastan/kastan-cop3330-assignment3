package ex41.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    public ArrayList<String> getStrings() throws FileNotFoundException {
        // create Arraylist String
        // Store path to file in String to use
        String filePath = "src/main/java/ex41/base/exercise41_input.txt";
        //store readFile method(path) in Array list;
        // return Arraylist
        return readFile(filePath);
    }

    public ArrayList<String> readFile(String filePath) throws FileNotFoundException {
        // open File
        File file = new File(filePath);
        // make scanner for file
        Scanner in = new Scanner(file);
        // make Array list to store strings
        ArrayList<String> strings = new ArrayList<>();
        // read every line in file and store in ArrayList
        while (in.hasNextLine()) {
            strings.add(in.nextLine());
        }
        // return Array list
        return strings;
    }
}
