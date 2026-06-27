package Recursion;

// Place Tiles of size 1*m in a floar of size n*m
public class tiles {

    public static int placedTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if(n<m){
            return 1;
        }

        int verticle = placedTiles(n - m, m);

        int horizontal = placedTiles(n - 1, m);

        return horizontal + verticle;
    }

    public static void main(String[] args) {
        System.out.println(placedTiles(4, 2));
    }
}
