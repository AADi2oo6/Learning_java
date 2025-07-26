package JAVA_DSA.LeetCode;
/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space
 */
public class O287_FindDublicateNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {

        int i = 0 ;
        while(i<arr.length){
//            check if the element is at correct index or not
            if (arr[i]!=i+1){
                int correct = arr[i]-1;
//                check wether the element at index i and index arr[i]-1 are equal or not
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }
                else {
                    return arr[i];
                }

            }
            else{
                i++;
            }}
        return -1;

    }
    static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

/*
class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0 ;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }}
        for (int j =0; j<arr.length;j++){
            if (arr[j]!=j+1){
                return arr[j];
            }
        }
        return -1;

    }
    void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
 */