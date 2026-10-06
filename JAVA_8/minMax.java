package JAVA_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class minMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 2, 1, 4);

        final Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());

        final Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());

        System.out.println(min.get());

        System.out.println(max.get());

    }
}
