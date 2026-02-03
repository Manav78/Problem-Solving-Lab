//  To count words in a sentence

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str=sc.nextLine();
        int count=0;
        boolean flag=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ' && !flag){
                count++;
                flag=true;
            }
            else if(str.charAt(i)==' '){
                flag=false;
            }
        }
        if(count==0){
                System.out.println("No words");
            }else{
                 System.out.println("Total words are: "+count);
            }
    }
}
