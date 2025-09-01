package Recursion;
//Q : an arrary will be given we have to check wether it is sorted or not

public class CheckIfSorted {
    static boolean isSorted(int[] arr){
        for(int i =1;i <arr.length;i++){
            if(arr[i-1]<=arr[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    static boolean isSortedRecursion(int[] arr,int i ){
        if (i==arr.length-1){
            return true;
        }
//        if(arr[i]<arr[i+1]){
//            return isSortedRecursion(arr,++i);
//        }
//        else {
//            return false;
//        }
        return arr[i]<arr[i+1] && isSortedRecursion(arr,++i);
    }
    public static void main(String[] args) {
        System.out.println("aditya");
        int[] arr = {1,2,4,3,5,6};
        System.out.println(isSortedRecursion(arr,0));
        System.out.println(5/2);

    }
}