// Reverse a string (without using built-in reverse)

public class StringReverse {
    public static void main(String[] args) {
        String str="Hello World!";
        StringBuilder strrev= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            strrev.append(str.charAt(i));
        }
        System.out.println(strrev.toString());
    }
}
