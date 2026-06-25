package Recursion;

//Stack hight is n
public class powerXtoN {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
