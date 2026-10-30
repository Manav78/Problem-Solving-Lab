package Sorting;

class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 2, 3, 4 };

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (swapped) {
                break;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
