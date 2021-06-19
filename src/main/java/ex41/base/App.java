package ex41.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // create App instance
        App app = new App();
        // create NameSorter class instance
        NameSorter nameSorter = new NameSorter();
        // get sorted array list from class sort
        ArrayList<String> names = nameSorter.getSortedNames();
        // generateOutput String
        String outputString = app.getOutputString(names);
        // printOutput
        System.out.print(outputString);
    }

    public String getOutputString(ArrayList<String> names) {
        String outputString = "Total of " + names.size() + " names\n" + "-----------------\n";
        for (int i = 0; i < names.size(); ++i) {
            outputString += names.get(i) + "\n";
        }
        return outputString;
    }
}
