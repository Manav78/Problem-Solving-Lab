public class FindMissingValues {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,9};
        int n=9;
        System.out.println("Missing Elements are: ");
        for(int i=1;i<=n;i++){
            int count=0;

            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                count++;
                 }
            }
            if(count==0){
                System.out.println(i);
            }
        }
        
    }
}
