public class p5 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=7;j++){
                if(i==4 && j%2==1 || i==3 && j%2==0 || i==2 && j%2==1 && j>2 && j<6 || i==1 && j==4){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
