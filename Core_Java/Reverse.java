package Core_Java;
// Q3. Write a Java program to reverse an integer.

public class Reverse {
    public static void main(String[] args) {
        int n = -1234;

        int rev = 0;
        while (n != 0) {
            if (rev >= Integer.MAX_VALUE / 10 && n % 10 > 7 || rev <= Integer.MIN_VALUE / 10 && n % 10 < -8) {
                System.out.println("Overflow");
                return;
            }
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }

        System.out.println(rev);
    }
}
