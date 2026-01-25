
// To check the number is duck number or not
import java.util.*;

class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String num = sc.next();

        if (num.charAt(0) == '0') {
            System.out.println(num + " is not a Duck Number");
            sc.close();
            return;
        }

        boolean flag = false;
        for (int i = 1; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (ch == '0'){
                flag = true;
                break;
            }     
        }
        System.out.println(num + (flag?" is a Duck Number":" is not a Duck Number"));
        sc.close();
    }
}