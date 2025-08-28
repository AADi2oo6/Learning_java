
import java.util.Arrays;

public class Temp {

    static void swap(int[][] arr, int x, int y) {
        int temp = arr[x][y];
        arr[x][y] = arr[y][x];
        arr[y][x] = temp;
    }

    static void reverse(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[0].length - 1 - j];
                arr[i][arr[0].length - 1 - j] = temp;
            }
        }
    }

    static void sortMatrix(int[][] arr) {
        // reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length / 2; j++) {
                if (i != j) {
                    swap(arr, i, j);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 7, 3}, {9, 8, 2}, {4, 5, 6}};
//    reverse(arr);
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));

        }
        System.out.println();
        reverse(arr); 
        sortMatrix(arr);
        reverse(arr);
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));

        }
    }
}
