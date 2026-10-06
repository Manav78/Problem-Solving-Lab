package JAVA_8;

import java.util.Arrays;
import java.util.List;

public class stringMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "martin");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
