package JAVA_DSA.LeetCode;

import java.util.Arrays;

/*
34. Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
 */
public class O34_FirstAndLastPosition {
    static public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = findStart(nums,target,true);
        ans[1] = findStart(nums,target,false);
        return ans;
    }
    // we will be solving this in 2 steps 1st will be to find the startvalue and
       // other will be to find the end value :
    static int findStart(int[] nums,int target,boolean FindStartIndex){
        int ans = -1; // if not found set it to -1 ;
        int start = 0 ;
        int end = nums.length-1;
        while (start<=end){
            int middle = start+(end-start)/2;
            if (target<nums[middle]){
                end = middle-1;
            }
            else if (target>nums[middle]){// continue searching till the target at middle
                start = middle+1;
            }else {// the target is at the center(target == nums[middle]) now we have to check in both the direction
                ans = middle ;//  one answer for the middle is found (which will change according to the repetation of the elements)
                if (FindStartIndex){// if we want ot calculate startindex
                    end = middle-1 ;// change the end value so that it will searh on left side
                }else{
                    start = middle+1;
                }

            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {};
        String  arr = Arrays.toString(searchRange(nums,3));
        System.out.println(arr);

    }
}
