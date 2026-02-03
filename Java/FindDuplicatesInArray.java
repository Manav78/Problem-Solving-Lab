// To find duplicates values in array

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,1};
        System.out.println("Original Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nRepeated values: ");
        for(int i=0;i<arr.length;i++){
        boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                }
                if(flag){
                    System.out.println(arr[i]);
                    flag=false;
                }
            }
        }
    }
}
