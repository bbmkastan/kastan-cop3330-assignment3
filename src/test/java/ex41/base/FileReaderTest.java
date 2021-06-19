package ex41.base;

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

    @Test
    void test_if_ReadFile_reads_from_file_correctly() throws IOException {
        // create instance od FileReader class
        FileReader fr = new FileReader();

        //create test file
        File testFile = new File("src/test/java/ex41/base/testFile.txt");

        // put test text in file
        FileWriter writer = new FileWriter(testFile);
        writer.write("Hello There\n" +
                "General Kenobi\n" +
                "12345\n" +
                "!@#$%^\n");
        writer.close();

        // create ArrayList<String> and add all necessary Strings
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Hello There");
        expectedList.add("General Kenobi");
        expectedList.add("12345");
        expectedList.add("!@#$%^");

        //test readFile method
        assertArrayEquals(expectedList.toArray(),
                (fr.readFile("src/test/java/ex41/base/testFile.txt")).toArray());
    }

    @Test
    void test_if_getStrings_method_gets_strings() throws IOException {
        // create instance od FileReader class
        FileReader fr = new FileReader();

        // create ArrayList<String> and add all necessary Strings
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Ling, Mai");
        expectedList.add("Johnson, Jim");
        expectedList.add("Zarnecki, Sabrina");
        expectedList.add("Jones, Chris");
        expectedList.add("Jones, Aaron");
        expectedList.add("Swift, Geoffrey");
        expectedList.add("Xiong, Fong");

        // test if getStrings method return correct Strings
        assertArrayEquals( expectedList.toArray(), (fr.getStrings()).toArray());
    }
}