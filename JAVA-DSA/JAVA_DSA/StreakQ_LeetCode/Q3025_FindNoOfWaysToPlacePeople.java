package JAVA_DSA.StreakQ_LeetCode;

import java.util.Arrays;

public class Q3025_FindNoOfWaysToPlacePeople {
    static boolean checkPairing(int[] p1,int[] p2){
        if((p1[0]<p2[0] && p1[1]>=p2[1] )|| (p1[0]<=p2[0] && p1[1]>=p2[1])){
            return true;
        }
        return false;
    }
    static boolean isValiedPair(int[][] arr,int[] p1,int[] p2){
        if (!checkPairing(p1,p2)){
            return false;
        }
        for (int[] x : arr){
            if(Arrays.equals(x,p1) || Arrays.equals(x,p2)){
                continue;
            }
            System.out.println("x : "+Arrays.toString(x));
            if (x[0] >= p1[0] && x[0] <= p2[0] && x[1] <= p1[1] && x[1] >= p2[1]) {
                return false;
            }

        }
        return true;
    }
    static int numberOfPairs(int[][] points) {
        int count =0;
        for(int i = 0 ; i<points.length-1;i++){
            for(int j = i+1; j<points.length;j++){
                if(isValiedPair(points,points[i],points[j])||isValiedPair(points,points[j],points[i])){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1}, {2,2},{3,3}};
//        System.out.println(checkPairing(arr[0],arr[1]));

//        System.out.println(isValiedPair(arr,arr[1], arr[2]));
        System.out.println(numberOfPairs(arr));
    }
}
