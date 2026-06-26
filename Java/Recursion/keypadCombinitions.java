package Recursion;

public class keypadCombinitions {
    public static String[] keypad = { ".", "abc", "def", "ghf", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void keypadCombinition(String str, int idx, String conminition) {
        if (idx == str.length()) {
            System.out.println(conminition);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];

        for (int i = 0; i < mapping.length(); i++) {
            keypadCombinition(str, idx + 1, conminition + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        keypadCombinition("2139403", 0, "");
    }
}
