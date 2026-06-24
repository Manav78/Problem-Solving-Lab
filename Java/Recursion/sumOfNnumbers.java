package Recursion;

public class sumOfNnumbers {

    public static void sum(int n, int sum1, int i) {
        if (i == n) {
            sum1 += i;
            System.out.println(sum1);
            return;
        }
        sum1 += i;
        sum(n, sum1, i+1);
    }

    public static void main(String[] args) {
        sum(5, 0, 1);
    }
}
