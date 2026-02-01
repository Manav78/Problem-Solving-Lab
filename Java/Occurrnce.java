// To check Occurrnce of digit
import java.util.Scanner;

public class Occurrnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = sc.next();

        for (int i = 0; i < num.length(); i++) {

            boolean processed = false;
            for (int k = 0; k < i; k++) {
                if (num.charAt(i) == num.charAt(k)) {
                    processed = true;
                    break;
                }
            }
            if (processed) continue;

            int count = 0;
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(i) == num.charAt(j)) {
                    count++;
                }
            }

            System.out.println(num.charAt(i) + " -> " + count);
        }
    }
}
