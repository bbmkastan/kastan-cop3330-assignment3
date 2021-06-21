package ex46.base;

import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        WordFrequencyFinder frequency = new WordFrequencyFinder();
        Map map = frequency.getFrequency("src/main/java/ex46/base/exercise46_input.txt");

    }
}
