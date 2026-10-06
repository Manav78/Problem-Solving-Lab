package JAVA_8;

import java.util.Arrays;
import java.util.List;

public class streamsSorted {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 3, 2, 5);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
