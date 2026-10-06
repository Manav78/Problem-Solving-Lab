package JAVA_8;

import java.util.Arrays;
import java.util.List;

public class count {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);

        long count = numList.stream().count();

        System.out.print(count);
    }
}
