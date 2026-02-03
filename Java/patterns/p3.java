public class p3 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=13;j++){
                if(j>=5-i && j<=i+3 && j<8 && i<=4|| j>=i+3 && i>=4 && j>=7 && j<=17-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
