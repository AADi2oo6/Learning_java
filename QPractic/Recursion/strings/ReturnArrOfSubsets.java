package Recursion.strings;

import java.util.ArrayList;
import java.util.Arrays;

//Q: Return an ArrayLisft of subsets
public class ReturnArrOfSubsets {
    static ArrayList<String> subseq(String up,String p){
        if(up.isEmpty()){// returning the value if unprocessed becomes empty
            ArrayList<String> arr = new ArrayList<>(1);
            arr.add(p);
            return arr;
        }
        ArrayList<String> left = subseq(up.substring(1),p+up.charAt(0));//take it ccase
        ArrayList<String> right = subseq(up.substring(1),p);// pass it case


        left.addAll(right); // adding anasers from both array list
        return left;
    }

    public static void main(String[] args){
        System.out.println(subseq("adi",""));
    }
}
