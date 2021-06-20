package ex42.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DataParserTest {

    @Test
    void getParsedData() {
    }

    @Test
    void test_if_parseData_method_gets_lastName() {
        DataParser parser = new DataParser();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kastan,Bao,0");
        String expected = "Kastan";

        assertEquals(expected, parser.parseData(arrayList).get(0).getLastName());
    }

    @Test
    void test_if_parseData_method_gets_firstName() {
        DataParser parser = new DataParser();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kastan,Bao,0");
        String expected = "Bao";

        assertEquals(expected, parser.parseData(arrayList).get(0).getFirstName());
    }

    @Test
    void test_if_parseData_method_gets_salary() {
        DataParser parser = new DataParser();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kastan,Bao,0");
        String expected = "0";

        assertEquals(expected, parser.parseData(arrayList).get(0).getSalary());
    }

}