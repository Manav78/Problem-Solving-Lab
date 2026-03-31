// Count the number of vowels and consonants in a string

class countVowel {

    public static void main(String[] args) {
        String str = "India is my country";
        str = str.toLowerCase();
        String vowels = "aeiou";

        int count = 0;
        int ccount = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    count++;
                } else {
                    ccount++;
                }
            }
        }
        System.out.println("Total vowels: " + count);

        System.out.println("Total consonants: " + ccount);

    }
}
