import java.sql.Array;
import java.util.Arrays;

public class TempQuestion {
    static void swap(int[] arr, int x, int y ){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void quickSort(int[] arr, int lo, int hi){
        if (lo>=hi){
            return;
        }
        int pivot = lo +(hi-lo)/2;
        int start = lo;
        int end = hi;
        while(start<=end){
            while(arr[start]<arr[pivot]){
                start++;
            }
            while(arr[end] > arr[pivot]){
                end--;
            }
            if(start<=end){
                swap(arr,start,end);
                start++;end--;
            }
        }
        quickSort(arr,lo,end);
        quickSort(arr,start,hi);

    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

