package JAVA_8;

import java.util.Arrays;
import java.util.List;

public class anyMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        final boolean check = numbers.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(check);

    }
}
