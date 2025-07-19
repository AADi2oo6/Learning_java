package JAVA_DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class O3_2dArrayBinarySearch {
    static int[] search2d(int[][] arr,int target){
        int [] result = {-1,-1};
        int start = 0;
        int row = arr.length-1;
        int column = arr[0].length-1;
        while (row>start && column>start){
            int middleRow = start+(row-start)/2;
            int middleColumn = start+(row-start)/2;

        }

    }
    static int[] searchIn2D(int[][] arr, int target){
        int [] result = {-1,-1};
        int row = 0;
        int column = arr.length-1;// taking a matrix of order n hence row = column;
        // if column>row then column = arr[0].length concedring all row has the same length
        while (row<arr.length && column >0){
            if (arr[row][column] == target){
                return new int[]{row,column};
            }
            else if (arr[row][column]>target){
                column--;
            }
            else {
                row ++;
            }
        }
        return result;
//        return new int[]{-1, -1};
    }




    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 4},
                {2, 5, 6},
                {7, 8, 9}

        };
        System.out.println(Arrays.toString(searchIn2D(arr,8)));
    }
}
