package ex46.base;

import classes_used_in_multiple_packages.FileReader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyFinderTest {

    @Test
    void test_getFrequency() throws IOException {
        String path = "src/test/java/ex46/base/test.txt";
        File file = new File(path);
        FileWriter writer = new FileWriter(file);
        writer.write("badger badger badger \n" +
                "badger mushroom \n" +
                "mushroom snake badger badger \n" +
                "badger ");
        writer.close();

        Map<String, Integer> expected = new HashMap<>();
        expected.put("badger",7);
        expected.put("mushroom",2);
        expected.put("snake",1);

        WordFrequencyFinder frequency = new WordFrequencyFinder();
        assertTrue(expected.equals(frequency.getFrequency(path)));
    }
}