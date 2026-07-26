package Core_Java;
// Q4. Write a Java program to find the second largest element in an integer array.

public class secondLargest {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 2, 0, 5, 3 };

        for (int i = 0; i < 2; i++) {
            for (int j = arr.length - 2; j >= 0; j--) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(arr[1]);

    }
}