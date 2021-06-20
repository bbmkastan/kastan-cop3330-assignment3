package ex41.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Bao Kastan
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void does_getSortedNames_return_not_a_null() throws Exception{
        NameSorter nameSorter = new NameSorter();

        assertTrue(nameSorter.getSortedNames() != null);
    }

    @ParameterizedTest
    @CsvSource({
            "0,'Johnson, Jim'",
            "1,'Jones, Aaron'",
            "2,'Jones, Chris'",
            "3,'Ling, Mai'",
            "4,'Swift, Geoffrey'",
            "5,'Xiong, Fong'",
            "6,'Zarnecki, Sabrina'",
    })
    void test_sort_method(int i ,String expected) {
        // create instance of name sorter
        NameSorter nameSorter = new NameSorter();

        //create unsorted Arraylist
        ArrayList<String> unsortedList = new ArrayList<>();
        unsortedList.add("Ling, Mai");
        unsortedList.add("Johnson, Jim");
        unsortedList.add("Zarnecki, Sabrina");
        unsortedList.add("Jones, Chris");
        unsortedList.add("Jones, Aaron");
        unsortedList.add("Swift, Geoffrey");
        unsortedList.add("Xiong, Fong");

        ArrayList<String> actualList = nameSorter.sort(unsortedList);

        // test sort method
        assertEquals(expected, actualList.get(i));
    }
}
