package Recursion;

public class moveChar {
    public static void moveCharX(String str, int idx, int count, String newStr, char ch) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += ch;
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == ch) {
            count++;
            moveCharX(str, idx + 1, count, newStr, ch);
        } else {
            newStr += currChar;
            moveCharX(str, idx + 1, count, newStr, ch);
        }
    }

    public static void main(String[] args) {
        moveCharX("manavabacav", 0, 0, "", 'a');
    }
}
