package JAVA_DSA;

public class O3_StrictIncreasing2dArray {
    public static void main(String[] args) {

    }

    static int[] binarySearch(int[][] arr, int row, int colStart, int colEnd, int target) {
        // this function will take row as input and then search in that row;
        while (colStart <= colEnd) {
            int middle = colStart + (colEnd - colStart) / 2;
            if (arr[row][middle] == target) {
                return new int[]{row, middle};
            }
            if (target > arr[row][middle]) {
                colStart = middle + 1;
            } else {
                colEnd = middle - 1;
            }

        }
        return new int[]{-1, -1};
    }
    static int[] searchIn2dSortedArray(int[][] arr,int target){
        int row = arr.length;
        int col = arr[0].length;
        if (row ==1){// means there is only one row in a matrix (1xn matrix : horizontal metrix)
            return binarySearch(arr,0,0,col-1,target);
            }
        int rowStart = 0;
        int rowEnd = row-1;
        int colMid = col/2;
        // run the loop till 2 rows are remaining
        while (rowStart<rowEnd-1){
            int middle = rowStart+(rowEnd-rowStart)/2;
            if (arr[middle][colMid] == target){
                return new int[] {middle,colMid};
            }
            else if (arr[middle][colMid] < target){
                rowStart = middle;
            }
            else {
                rowEnd = middle;
            }

            }
//        now after exiting this loop we will have two rows if answer not found ;
//        now check for the element in the mid-column
        if (arr[rowStart][colMid] == target){
            return new int[] {rowStart,colMid};
        }
//       now let check for the element in the 4 parts
//        else if()
//
//        }

        return new int[0];
    }}

