package JAVA_DSA.LeetCode;
// Bitonic or Mountain array are the which has elements whos value 1st increase and then decrease
//Q: find the peak element of the Mountain array
public class O852_BitonicOrMountenArray {
    static int peakOfArray(int[] arr){
        int start =0 ;
        int end = arr.length-1;
        while (end>start){
            int middle = start + (end-start)/2;
            if (arr[middle]>arr[middle+1]){
                end = middle;
            }
            else {
                start = middle+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,561,434,234,89,67,45,34,23,22,11,9,8,7,5,4,3,2,0};
        System.out.println(peakOfArray(arr));
    }
}
