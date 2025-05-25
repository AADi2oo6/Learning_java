import java.util.Arrays;
import java.util.Scanner;

public class o10_2dArray {
    public static void main(String[] args) {
        // Let's see the 2d array
        Scanner input = new Scanner(System.in);
//        Note while creating a 2d array it is necessary
//        > to specify the no. of ROWS. (NO. of columns not necessary);
//        > means no. or columns in each row can be different
        int[][] array2D = new int[3][3];// the array will have 3 rows
        int[][] array = {
                {1,2,3},
                {4,5},
                {6,7,8,9},
        };
        for (int[] i: array) {
            System.out.println(Arrays.toString(i));
        }
        // inserting into an 2d array ;
        for(int i = 0;i<array2D.length;i++){
            System.out.print("Enter the element of the "+i+"th row : ");
            for (int j = 0 ; j< array2D[i].length;j++){
                //                      ^ because of this every array at i'th row can have different no. of elements
                array2D[i][j] = input.nextInt();
            }
        }

        // printing the 2d Array;
        for (int[] l: array2D){
            System.out.println(Arrays.toString(l));
        }
        for (int i = 0 ; i < array2D.length;i++){
            for (int j = 0 ; j< array2D[i].length;j++){
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }

    }
}

