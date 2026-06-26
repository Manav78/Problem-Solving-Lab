package Recursion;

public class charOccurence {
    static int first = -1;
    static int last = -1;

    public static void Occurence(String str, int idx, char ch) {
        if (str.length() == idx) {
            System.out.println("First and Last Occurence: " + first + " " + last);
            return;
        }
        if (str.charAt(idx) == ch) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        Occurence(str, idx + 1, ch);
    }

    public static void main(String[] args) {
        Occurence("akbhfsd", 0, 'a');
    }
}
