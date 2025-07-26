package JAVA_DSA.LeetCode;
//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.
public class O628_MissingNumber {
    public static void main(String[] args) {
        int[] arr  = {3,4,2,1,0};
        System.out.println(findMissing(arr));
    }
    static int findMissing(int[] arr){
        int i= 0 ;
        while (i<arr.length){
            int correct = arr[i];
//           check if elemen at index i < lenght and swap if element at index i is not equal to i
            if (arr[i] < arr.length && i!=correct){
                swap(arr, i, correct);
            }
//            if both the case fales increase the value of i means increase i if arr[i] = lenght and if element is at correct index
            else {i++;}
        }
//        now check for the element hear
        for (int a =0 ; a<arr.length; a++){
//            if after sorting any element not found at correct inedx(means element equal to inex not present) return that index
            if (arr[a]!=a) {
                return a;
            }

        }
//        else if everything is correct and array is sorted means the element = lenght is missing hence return the lenght
        return arr.length;
    }
    static void swap(int[] arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}


/* more correct version for the above solution
1st. calcualte the total sum of the number from 0 to n = n(n+1)/2;
2nd. find the sum of all the element preseint in the array ;
3rd. find the difference that will be our answer ;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}

 */