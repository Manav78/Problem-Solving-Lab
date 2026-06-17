public class stringBuilder1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        // Adding char at last
        str.append("Hello");
        System.out.println(str);

        // Adding char at Index
        str.insert(0, 'M');
        System.out.println(str);

        // Deleting from to
        str.delete(1, 2);
        System.out.println(str);

        // Get char at Index
        System.out.println(str.charAt(0));

        // Replace char with Index
        str.setCharAt(0, 'H');
        System.out.println(str);

        // String Reverse
        // int st =0; int end = str.length()-1;
        // while (st < end) {
        // char front = str.charAt(st);
        // char back = str.charAt(end);

        // str.setCharAt(end, front);
        // str.setCharAt(st, back);
        // st++;
        // end--;
        // }
        // System.out.println(str);

        // String Reverse
        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str.length() - 1 - i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);

    }
}
