package ex42.base;

import classes_used_in_multiple_packages.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class DataParser {

    public ArrayList<Person> getParsedData() throws Exception {
        //create instance of FileReader
        FileReader fileReader = new FileReader();
        //tell File Reader the File Path
        fileReader.setFilePath("src/main/java/ex42/base/exercise42_input.txt");
        //getString from FileReader
        ArrayList<String> unParsedData = fileReader.getStrings();
        //Parse data into separated by commas into Person ArrayList
        //Return parsed Data
        return parseData(unParsedData);
    }

    public ArrayList<Person> parseData (ArrayList<String> unParsedData) {
        // create person arrayList
        ArrayList<Person> people = new ArrayList<>();
        // for unParsed arraylist length
        for (String unParsedDatum : unParsedData) {
            // split string by "," into array
            String[] parts = unParsedDatum.split(",");
            // create a new person.add(array[0],array[1],array[2])
            people.add(new Person(parts[0], parts[1], parts[2]));
        }
        // return person array
        return people;
    }

}
