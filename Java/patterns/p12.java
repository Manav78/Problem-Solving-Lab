class p12{
    public static void main(String []args){
        for(int i=0;i<=3;i++){
            for(int j=0;j<=4;j++){
                if(j>=4-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}