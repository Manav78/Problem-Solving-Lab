package JAVA_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class streamsSorted {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 3, 2, 5);

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        List<String> words = Arrays.asList("apple", "banana", "kiwi", "cherry");

        List<String> sortedWordsByLength = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        sortedWordsByLength.forEach(System.out::println);
    }
}
