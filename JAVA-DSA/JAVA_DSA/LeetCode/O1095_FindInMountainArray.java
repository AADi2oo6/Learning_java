package JAVA_DSA.LeetCode;
// search of element in an mountain array;
// 1st find the peak element and then search for the element on both the side;
public class O1095_FindInMountainArray {
    static int findInMountainArray(int target, int[] arr) {

        int p = peak(arr);
        int a = searchBinary(arr,target,true);
        int b = searchBinary(arr,target,false);
        if (a !=-1){
            return a;
        }
        else {
            return b;
        }
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1 ;
        while (start < end){
            int middle = start +(end-start)/2;
            if (arr[middle]<arr[middle+1]){
                start = middle +1;
            }
            else {
                end = middle;
            }
        }
        return end;
    }
    static int searchBinary(int[] arr, int target,boolean reverse){
        int start = 0 ;
        int end = arr.length;
        while (start<= end){
            int middle = start+(end-start)/2;
            if (reverse){
                if (arr[middle]<target){
                    end = middle -1 ;
                }
                else {
                    start = middle +1;
                }
                if (arr[middle]==target){
                    return middle;
                }
            }
            else {
                if (arr[middle]<target){
                    start = middle +1 ;
                }
                else {
                    end = middle -1;
                }
                if (arr[middle]==target){
                    return middle;
                }
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,6,4,3,0};
        System.out.println(findInMountainArray(3,arr));
    }
}
