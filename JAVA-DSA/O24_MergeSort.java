import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.locks.LockSupport;

public class O24_MergeSort {
    // MergeSort : it is a type of sorting techinque in which sorting is done by mergin two sorted arrays;

//    steps:--------------
//    1. Split the given array in two parts until become array of single elements
//    2. Sort those two arrays and merge them

    static int[] merge(int[] arr1 , int[] arr2){
        // given two sorted arrays and we have to merge them;
//        let take pointer p1 and p2 for those two array and p3 for the new array; initilly poining to 1st element
        int p1=0,p2=0,p3=0;
        int[] sorted = new int[arr1.length+arr2.length]; // creating new sorted array

        while(p1<arr1.length && p2<arr2.length) {//either arr1 or arr2 lenght will be smaller to take care of smaller array(index error)
            if(arr1[p1]>arr2[p2]){
                sorted[p3] = arr2[p2];
                p2++;
            }else{
                sorted[p3] = arr1[p1];
                p1++;
            }
//            System.out.println(Arrays.toString(sorted));
            p3++;
        }
        // after loop ends either p1 or p2 will reach its end
        while(p1<arr1.length){ // if p2 reaches it's end then rest elements of p1 will be filled in sorted
            sorted[p3] = arr1[p1];
            p1++;
            p3++;
        }while(p2<arr2.length){// if p1 reaches it's end then rest elements of p2 will be filled in sorted
            sorted[p3] = arr2[p2];
            p2++;
            p3++;
        }
        return sorted;
    }
    static int[] MergeSort(int[] arr){
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] first = MergeSort(Arrays.copyOfRange(arr,0,mid));// break until length =1
        int[] second = MergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);


    }
    public static void main(String[] args) {
        int[] arr1 = {23,42,11,345,123,66,2,6,94,31,57,4};
        System.out.println(Arrays.toString(MergeSort(arr1)));
    }
}
