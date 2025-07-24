import java.util.Arrays;

public class o14_SelectionSort {
    public static void main(String[] args){
        int[] arr = {};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length;i++){
            int last = arr.length-1-i;// this is the position of the last element
            // find the max element in the remaining array and swap with the last element
            for(int j = 0 ; j<arr.length-1-i;j++){
                if (arr[j]>arr[last]){
                    int temp = arr[j];
                    arr[j] = arr[last];
                    arr[last] = temp;
                }
            }
        }
    }
}

