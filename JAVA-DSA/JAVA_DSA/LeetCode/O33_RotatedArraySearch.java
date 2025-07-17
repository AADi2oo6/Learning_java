package JAVA_DSA.LeetCode;
// rotated array : {5,6,7,8,9,0,1,2} : there  are tow ascending array in the rotated array
// therefore there is only one position where : arr[n+1]-arr[n] <0;
// we have to make 4 cases in order to solve this type of quesiton;
public class O33_RotatedArraySearch {
    static int searchPeak(int[] arr){
        int start = 0 ;
        int end = arr.length-1;
        while (start<=end){
            int middle = start + (end-start)/2;
            if (middle < end && arr[middle]>arr[middle+1]){//Case 1 : middle is the peak element;
                return middle;
            }
            else if (middle < end && arr[middle]<arr[middle-1]) {// case 2 : element before middle is peak;
                return middle -1;
            }
            else if (arr[middle]<=arr[start]){
                end = middle-1;
            }
            else {
                start = middle +1;
            }

        }
        return -1;
    }
}
