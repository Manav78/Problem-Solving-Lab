class rowcolAddition {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2},
            {3, 4}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        int[] rowSum = new int[rows];
        int[] colSum = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowSum[i] += arr[i][j];
                colSum[j] += arr[i][j];
            }
        }

        // Print row sums
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + " sum: " + rowSum[i]);
        }

        // Print column sums
        for (int j = 0; j < cols; j++) {
            System.out.println("Column " + (j + 1) + " sum: " + colSum[j]);
        }
    }
}