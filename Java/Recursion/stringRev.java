package Recursion;

public class stringRev {
    public static void stringReverse(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        stringReverse(str, idx - 1);
    }

    public static void main(String[] args) {
        String str="abcd";
        stringReverse(str,str.length()-1 );
    }
}
