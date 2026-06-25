package Recursion;

public class fibbo {
    public static void fibo(int f1, int f2, int n) {
        if (n == 0) {
            return;
        }
        int f3 = f1 + f2;
        System.out.println(f3);
        fibo(f2, f3, n-1);
    }

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fibo(0, 1, 5-2 );
    }
}
