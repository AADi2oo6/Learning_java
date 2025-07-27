package JAVA_DSA.LeetCode;

import java.util.Arrays;

/*
41. First Missing Positive
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 */
public class O41_Find1stPositiveMissing {
//    in short : just calculate the 1st missing +ve number starting from 1 to n;
//    how to procede: 1st ignore the -ve numbers and number> n
    public static void main(String[] args) {
        int[] arr = {1,2,4};
//        MissingPostive(arr);
        System.out.println(MissingPostive(arr));
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int MissingPostive(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if (arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,correct,i);

            }
            else {
                i++;
            }
        }
        for (i =0; i<arr.length;i++){
            if (arr[i]!=i+1){
                return i+1;
            }
//            else if (arr.length==1 && arr[0]==1){
//                return 2;
//            }
        }
        System.out.println(Arrays.toString(arr));
        return i+1;
    }
    /*
    class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int val = nums[i];
            // Place nums[i] at its correct position if possible
            while (
                val > 0 &&
                val <= n &&
                nums[val - 1] != val
            ) {
                int next = nums[val - 1];
                nums[val - 1] = val;
                val = next;
            }
        }

        // Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}

     */
}
