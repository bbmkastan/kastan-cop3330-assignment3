package ex45.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TextManipulatorTest {

    @Test
    void generateNewFile() throws IOException {
        TextManipulator text = new TextManipulator();
        assertTrue(text.generateNewFile("src/test/java/ex45/base/test.txt", "hi"));
    }

    @Test
    void replaceUtilizeWithUse() throws Exception {
        TextManipulator text = new TextManipulator();
        String path = "src/test/java/ex45/base/test.txt";
        File file = new File(path);
        FileWriter writer = new FileWriter(file);
        writer.write("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".");
        writer.close();

        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".\n";

        assertEquals(expected, text.replaceUtilizeWithUse(path));
    }

    @Test
    void getStringFromArrayList() {
        TextManipulator text = new TextManipulator();
        ArrayList<String> input= new ArrayList<>();
        input.add("Hello");
        input.add("Hello");
        input.add("Hello");

        String expected = "Hello\nHello\nHello\n";
        assertEquals(expected, text.getStringFromArrayList(input));
    }
}