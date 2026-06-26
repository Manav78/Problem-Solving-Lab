package Recursion;

import java.util.HashSet;

public class uniqueSubsequences {

    public static void sub(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be
        sub(str, idx + 1, newStr + currChar, set);
        // not to be
        sub(str, idx + 1, newStr, set);

    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        sub("abs", 0, "", set);
    }
}
