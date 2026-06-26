package Recursion;

public class removeDuplicates {
    static boolean[] map = new boolean[26];

    public static void removesDuplicate(String str, int idx, String newStr) {
        if (str.length() == idx) {
            System.out.println(newStr);
            return;
        }
        if (map[str.charAt(idx) - 'a']) {
            removesDuplicate(str, idx + 1, newStr);
        } else {
            newStr += str.charAt(idx);
            map[str.charAt(idx) - 'a'] = true;
            removesDuplicate(str, idx + 1, newStr);
        }
    }

    public static void main(String[] args) {
        removesDuplicate("manavvam", 0, "");
    }
}
