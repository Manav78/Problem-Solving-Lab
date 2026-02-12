// Finding missing values in an array
public class FindMissingValue {
    public static void main(String[] args) {
        int arr[]={3,2,5,4};
        // n(n+1)/2
        int n=arr.length+1;
        int expected = (n*(n+1))/2;
        int actual=0;
        for(int i=0;i<arr.length;i++){
            actual+=arr[i];
        }
        System.out.println("Missing Element is: "+(expected-actual));
    }
}
