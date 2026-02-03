// To find GCD of two numbers
import java.util.*;
class GCD{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2=sc.nextInt();
        int smallest=0;
        int gcd=0,i;
        if(num1>num2){
            smallest=num2;
        }else{
            smallest=num1;
        }
        for(i=1;i<=smallest/2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD is: "+gcd);
    }
}