package JAVA_DSA.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class O442_FindAllDublicate {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicate(arr));
    }
    static List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int i = 0 ;
        while(i<arr.length){
            if (arr[i]!=i+1){
                int correct = arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }
                else{
                    ans.add(arr[i]);
                    i++;
                }

            }
            else{
                i++;
            }
        }
        return ans;
    }
    static List<Integer> findAllDuplicate(int[] arr) {
        List<Integer> ans = new ArrayList<>();
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
                    if(!ans.contains(arr[i])){
                       ans.add(arr[i]);
                    }
                    i++;
                }

            }
            else{
                i++;
            }}
        return ans;

    }
    static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}