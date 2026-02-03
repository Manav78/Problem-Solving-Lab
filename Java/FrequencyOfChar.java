//  To count frequency of a character in a word or sentence

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or sentence: ");
        String str= sc.nextLine();
        System.out.println("Enter character to check occurence: ");
        char key= sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==key){
                count++;
            }
        }
        System.out.println("'"+key+"' Occured "+count+" times.");
    }
}
