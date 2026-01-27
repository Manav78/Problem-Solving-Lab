// To calculate sum of digits
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int sum=0;
        while (num>0) {
            int temp=num%10;
            sum+=temp;
            num/=10;
        }
        System.out.println("Sum of all digits is: "+sum);
    }
}
