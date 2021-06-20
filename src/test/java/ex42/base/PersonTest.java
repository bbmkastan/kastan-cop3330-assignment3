package ex42.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void test_Constructor_for_lastName() {
        Person person = new Person("Kastan", "Bao","2");
        assertEquals("Kastan", person.getLastName());
    }

    @Test
    void test_Constructor_for_firstName() {
        Person person = new Person("Kastan", "Bao","2");
        assertEquals("Bao", person.getFirstName());
    }

    @Test
    void test_Constructor_for_salary() {
        Person person = new Person("Kastan", "Bao","2");
        assertEquals("2", person.getSalary());
    }

    @Test
    void test_setFirstName() {
        Person person = new Person("Unknown", "Unknown","Unknown");
        person.setFirstName("Bao");
        assertEquals("Bao", person.getFirstName());
    }

    @Test
    void test_getFirstName() {
        Person person = new Person("Unknown", "Unknown","Unknown");
        person.setFirstName("Bao");
        assertEquals("Bao", person.getFirstName());
    }

    @Test
    void test_setLastName() {
        Person person = new Person("Unknown", "Unknown","Unknown");
        person.setLastName("Kastan");
        assertEquals("Kastan", person.getLastName());
    }

    @Test
    void test_getLastName() {
        Person person = new Person("Unknown", "Unknown","Unknown");
        person.setLastName("Kastan");
        assertEquals("Kastan", person.getLastName());
    }

    @Test
    void test_setSalary() {
        Person person = new Person("Unknown", "Unknown","Unknown");
        person.setSalary("2");
        assertEquals("2", person.getSalary());
    }

    @Test
    void test_getSalary() {
        Person person = new Person("Unknown", "Unknown","Unknown");
        person.setSalary("2");
        assertEquals("2", person.getSalary());
    }
}