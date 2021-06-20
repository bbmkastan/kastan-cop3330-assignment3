package ex42.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Bao Kastan
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generateOutputString() {
        App app = new App();
        String expected =
                "Last      First     Salary\n" +
                "--------------------------\n" +
                "Ling      Mai       55900\n" +
                "Johnson   Jim       56500\n" +
                "Jones     Aaron     46000\n";
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ling","Mai","55900"));
        people.add(new Person("Johnson","Jim","56500"));
        people.add(new Person("Jones","Aaron","46000"));

        assertEquals(expected,app.generateOutputString(people));
    }
}