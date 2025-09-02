import java.util.Arrays;

public class O26_QuickSort {
    static void pivotPostion(int[] arr,int low, int high){
        if(low>=high){
            return;
        }
        int s =low,e =high;
        int mid = s+(e-s)/2;
        int pivot = mid;
        while (s<=e){
            while(arr[s]<arr[pivot]){
                s++;
            }
            while(arr[e]>arr[pivot]){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] =  arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // now after bringing the pivot at the correct index let's sort the remainging two half of the array low to pivot and pivot to high
        pivotPostion(arr,low,e);
        pivotPostion(arr,s,high);

    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6};
        pivotPostion(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
