package JAVA_8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class streamsFlatMap {
    public static void main(String[] args) {
        List<List<String>> listofLists = Arrays.asList(
            Arrays.asList("a","b"),
            Arrays.asList("c","d"),
            Arrays.asList("e","f")
        );

        listofLists.stream()
        .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
