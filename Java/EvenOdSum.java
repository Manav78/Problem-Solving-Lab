// To calculate sum of even and odd numbers in an Array
import java.util.Scanner;

public class EvenOdSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter?: ");
        int size=sc.nextInt();
        int even_sum=0,odd_sum=0;
        int arr[]= new int[size];
        System.out.println("Enter Elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                even_sum+=arr[i];
            }else{
                odd_sum+=arr[i];
            }
        }
        System.out.println("Even Sum= "+even_sum+"\nOdd Sum= "+odd_sum);
    }
}
