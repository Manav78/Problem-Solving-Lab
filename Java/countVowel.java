// to check vowels in the word
import java.util.Scanner;

public class countVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                count++;
            }
        }
        System.out.println("Total Vowels in the given word: "+count);
    }
}
