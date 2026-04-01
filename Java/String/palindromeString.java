public class palindromeString {
    public static void main(String[] args) {
        String str="H h ";

        str=str.replaceAll("a-zA-Z","").toLowerCase();

        StringBuilder reversedStr = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reversedStr.append(str.charAt(i));
        }
        if(str.equals(reversedStr.toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
