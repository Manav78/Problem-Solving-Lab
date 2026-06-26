package Recursion;

public class subsequences {
    public static void sub(String str, int idx, String newStr) {

        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // to be
        sub(str, idx + 1, newStr + str.charAt(idx));

        // not to be
        sub(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        sub("abc", 0, "");
    }
}
