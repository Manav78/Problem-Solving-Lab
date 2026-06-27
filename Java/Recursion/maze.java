package Recursion;

public class maze {
    public static int calPaths(int i, int j, int n, int m) {

        if (i == n || j == m) {
            return 0;
        }

        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int down = calPaths(i + 1, j, n, m);

        int right = calPaths(i, j + 1, n, m);

        return right + down;
    }

    public static void main(String[] args) {
        System.out.println(calPaths(0, 0, 3, 4));
    }
}
