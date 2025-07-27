package JAVA_DSA.LeetCode;

import java.util.Arrays;

//Q 645 : Set Missmatch
//You have a set of integers s, which originally contains all the numbers from 1 to n.
//Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
//which results in repetition of one number and loss of another number.
//
//You are given an integer array nums representing the data status of this set after the error.
//
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
public class O645_SetMismatch {

//    inSimple word : return a list containing {repeatedElement,MissingNumber};
    public static void main(String[] args) {
        int[] arr= {8,7,3,5,3,6,1,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int[] misMatchSet(int[] arr){
        int[] ans = {-1,-1};
        int i =0;
//        checking for the duplicate element
        while(i<arr.length){
            if (arr[i]!=i+1){
                int correct = arr[i]-1;
                if (arr[i]!=arr[correct]){
                    swap(arr,i,correct);

                }
                else{
                    ans[0] = arr[i];
                    i++;
                }
            }
            else{
                i++;
            }
        }
//        checking for the missing element
        for (i =0 ;i<arr.length;i++){
            if (arr[i]!=i+1){
                ans[1] = i+1;
                break;
            }
        }
        return ans;
    }
//    earlier this was giving error
//    modefing it : 1st sort the array and then check for the wrong index elemnt and return {wrongIndexelement,wrongIndex+1};
static int[] findErrorNums(int[] arr) {
    int i = 0 ;
    while(i<arr.length){
        int correct = arr[i] -1;
        if (arr[i]!=arr[correct]){
            swap(arr,i,correct);}
        else {
            i++;
        }

    }
    for (i =0 ; i<arr.length;i++){
        if (arr[i] !=i+1){
            return new int[] {arr[i],i+1};
        }
    }
    return new int[] {-1,-1};
}


}
