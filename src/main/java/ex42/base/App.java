package ex42.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // create instance of App
        App app = new App();
        // create instance of DataParser
        DataParser dataParser = new DataParser();
        // create an formatted outputString
        String outputString = app.generateOutputString(dataParser.getParsedData());
        // printOutput
        System.out.println(outputString);
    }

    public String generateOutputString(ArrayList<Person> parsedData) {
        String outputString = String.format("%-10s%-10s%s\n","Last","First","Salary");
        for (int i = 0; i <= 25; ++i) {
            outputString += "-";
        }
        outputString += "\n";
        for (Person parsedDatum : parsedData) {
            outputString += String.format("%-10s%-10s%s\n", parsedDatum.getLastName(),
                    parsedDatum.getFirstName(), parsedDatum.getSalary());
        }
        return  outputString;
    }
}
