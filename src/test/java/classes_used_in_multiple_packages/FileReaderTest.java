package classes_used_in_multiple_packages;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Bao Kastan
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;



class FileReaderTest {

    @BeforeEach
    void setUp() throws IOException {
        //create test file
        File testFile = new File("src/test/java/classes_used_in_multiple_packages/testFile.txt");

        // put test text in file
        FileWriter writer = new FileWriter(testFile);
        writer.write("Hello There\n" +
                "General Kenobi\n" +
                "12345\n" +
                "!@#$%^\n");
        writer.close();

        File testFile2 = new File("src/test/java/classes_used_in_multiple_packages/testFile2.txt");

        // put test text in file
        FileWriter writer2 = new FileWriter(testFile2);
        writer2.write("Ahhhhhhhhhhhhhhh");
        writer2.close();
    }

    @Test
    void test_setFilePath() {
        FileReader fileReader = new FileReader();
        fileReader.setFilePath("Hello.txt");
        assertTrue(fileReader.getFilePath().equals("Hello.txt"));
    }

    @Test
    void test_getFilePath() {
        FileReader fileReader = new FileReader();
        fileReader.setFilePath("Hello.txt");
        assertTrue(fileReader.getFilePath().equals("Hello.txt"));
    }

    @Test
    void test_if_getStrings_method_returns_not_null() throws IOException {
        // create instance od FileReader class
        FileReader fileReader = new FileReader();
        fileReader.setFilePath("src/test/java/classes_used_in_multiple_packages/testFile2.txt");
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Ahhhhhhhhhhhhhhh");
        assertTrue((expectedList.get(0)).equals((fileReader.getStrings()).get(0)));
    }

    @Test
    void test_if_ReadFile_reads_from_file_correctly() throws IOException {
        // create instance od FileReader class
        FileReader fileReader = new FileReader();

        // create ArrayList<String> and add all necessary Strings
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Hello There");
        expectedList.add("General Kenobi");
        expectedList.add("12345");
        expectedList.add("!@#$%^");

        //test readFile method
        assertArrayEquals(expectedList.toArray(),
                (fileReader.readFile("src/test/java/classes_used_in_multiple_packages/testFile.txt")).toArray());
    }
}