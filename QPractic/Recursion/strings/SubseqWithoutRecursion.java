package Recursion.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubseqWithoutRecursion
{
//    given an array {1,2,3} return an array with all the subseq of arr without using recursion
    static List<List<Integer>> subSeqMethod2(int[] arr){
        List<List<Integer>> OuterList = new ArrayList<>();
        //initilising outer list with and empty list;
        OuterList.add(new ArrayList<>());
        // now let's update Outer list one by one'
        for(int i : arr){

            int n = OuterList.size();//

            for(int j = 0; j<n;j++){ // now j will point to the indexes of lists present inside outer
                List<Integer> InnerList = new ArrayList<>(OuterList.get(j)); //OuterList.get(j) means get the value at index i from outer list
                // so the innnerList = copy of jth index of outerlist array;
                InnerList.add(i); // adding i to the inner list
                OuterList.add(InnerList);// now adding upgraded InnerList to the OuterList;
            }
        }
        return OuterList;
    }
    static List<List<Integer>> subSeq(int[] arr){
        List<List<Integer>> Outer = new ArrayList<>();
        Outer.add(new ArrayList<>());// Initial element in the Outer List;
        // now we will insert every value in the outer one by one;
        for(int i : arr){
            List<List<Integer>> temp = new ArrayList<>(); // createing a temprary array for storing lists as Outer list is being used in For-each case (can't update)
            for (List<Integer> InnerList : Outer) {
                List<Integer> newInner = new ArrayList<>(InnerList);
                newInner.add(i);
                temp.add(newInner);
            }
            Outer.addAll(temp);

        }
        return Outer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subSeqMethod2(arr));
    }
}
