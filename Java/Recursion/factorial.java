package Recursion;

public class factorial {
    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int ft = fact(n-1);
        int ft_nm = n * ft; 
        return ft_nm;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
