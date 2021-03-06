package ex41.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Bao Kastan
 */

import classes_used_in_multiple_packages.FileReader;

import java.util.ArrayList;
import java.util.Collections;

public class NameSorter {
    public ArrayList<String> getSortedNames() throws Exception {
        // create instance of FileReader Class
        FileReader fileReader = new FileReader();
        // Tell FileReader the file path
        fileReader.setFilePath("src/main/java/ex41/base/exercise41_input.txt");
        // use FileReader to get an Arraylist and store it
        ArrayList<String> names = fileReader.getStrings();
        // call sort method to sort arraylist and return that
        return sort(names);
    }
    
    public ArrayList<String> sort (ArrayList<String> names) {
        // Sort Array list using Collections and return
        Collections.sort(names);
        // return Arraylist
        return names;
    }
}
