package JAVA_DSA.LeetCode;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;

//448. Find All Numbers Disappeared in an Array
//Given an array nums of n integers where nums[i] is in the range [1, n],
//return an array of all the integers in the range [1, n] that do not appear in nums.
public class O448_FindListOfMissingNumber {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,5,4,2,1};
        System.out.println(MissingNumberArray(arr));
    }
    static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static List<Integer> MissingNumberArray(int[] arr){
        int i = 0 ;
        List<Integer> ans = new ArrayList<>();
        while (i< arr.length){
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!= j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}
