
import java.util.Scanner;

// To check the given number is binary or not

public class BinaryOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        String nm=sc.nextLine();
        boolean flag=true;
        for(int i=0;i<nm.length();i++){
            char ch=nm.charAt(i);
            if(ch!='0' && ch!='1'){
                flag=false;
            }
        }
        if(flag){
            System.out.println(nm+" is a Binary Number");
        }else{
            System.out.println(nm+" is Not a Binary Number");
        }
    }
}
