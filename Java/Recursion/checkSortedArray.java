package Recursion;

public class checkSortedArray {
    // Sorted and Strictly Incresing Order
    public static boolean checkArray(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return checkArray(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3 };
        System.out.println(checkArray(arr, 0));

    }
}
