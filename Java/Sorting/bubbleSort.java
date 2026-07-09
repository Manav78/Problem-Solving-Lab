package Sorting;

class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 1, 3, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSkiped = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSkiped = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (isSkiped) {
                break;
            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}