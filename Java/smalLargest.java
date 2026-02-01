public class smalLargest {
    public static void main(String[] args) {
        int arr[]={4,2,9,1};

        int smallest=9999,largest=-99999;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Smalllest Element: "+smallest+"\nLargest Element: "+largest);
    }
}
