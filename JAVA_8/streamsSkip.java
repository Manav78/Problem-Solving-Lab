package JAVA_8;

import java.util.Arrays;
import java.util.List;

public class streamsSkip {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().skip(2).forEach(System.out::println);
    }
}
