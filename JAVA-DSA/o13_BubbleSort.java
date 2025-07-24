import java.util.Arrays;

public class o13_BubbleSort {
    public static void main(String[] args) {
        int[] x= {3,1,5,4,2};
        System.out.println(Arrays.toString(bubbleSort(x)));
    }
    static int[] bubbleSort(int[] arr){
        boolean Swaped ;
        // Run the steps n-1 times
        for (int i =0; i< arr.length;i++){
            Swaped = false ;// set swapped = false in each pass
            for (int j = 1 ; j<arr.length-i;j++){
                // Swap if the element is smaller than the previous element;
                if (arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    Swaped = true;
                }

            }
//            if do not swaped for the particular value of i : means the
//            the Array is sorted there for break
            if (!Swaped){
                break;
            }
        }
        return arr;
    }
}
