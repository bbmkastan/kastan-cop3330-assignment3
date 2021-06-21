package ex46.base;

import classes_used_in_multiple_packages.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyFinder {
    public Map getFrequency(String path) throws FileNotFoundException {
        FileReader file = new FileReader();
        file.setFilePath(path);
        ArrayList<String> stringsList = file.getStrings();

        String string = "";
        for (int i = 0; i < stringsList.size(); i++) {
            string += stringsList.get(i);
        }

        String[] words = string.split("\s");

        Map<String,Integer> frequency = new HashMap<>();

        for (int i = 0; i < words.length; ++i) {
            Integer n = frequency.get(words[i]);
            n = (n == null) ? 1 : ++n;
            frequency.put(words[i],n);
        }

        return frequency;
    }
}
