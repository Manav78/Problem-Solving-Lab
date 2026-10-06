package JAVA_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class array {
    public static void main(String[] args) {
        int[] premitiveArray = { 1, 2, 3, 4 };

        Integer[] objectArray = { 5, 6, 7, 8 };

        final IntStream intStream = Arrays.stream(premitiveArray);
        intStream.forEach(System.out::println);

        final Stream<Integer> integerStream = Stream.of(objectArray);
        integerStream.forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(9, 10, 11, 12);
        integerList.stream().forEach(System.out::println);

    }
}
