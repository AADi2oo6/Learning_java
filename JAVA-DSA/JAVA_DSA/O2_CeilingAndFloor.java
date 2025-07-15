package JAVA_DSA;
import java.util.Scanner;
//Ceiling : Smallest number in an array which is just greater than equal to the target;
// the code for finding the ceiling is same as that of the BinarySearch
//      2 cases are formed
            //1st : element found => then return the element opsiton;
            //2nd : element not found => return smallest number >=target
                    // for this when the while loop ends start become > end and the value at start becomes the smallest number >= target;
public class O2_CeilingAndFloor {
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean rev = arr[start]>arr[end];
         while (end>=start){
            int middle = start+(end - start)/2;
            if (rev){
                if (target>arr[middle]){
                    end = middle-1;
                }
                else {
                    start = middle+1;
                }
            }else {
                if (target<arr[middle]){
                    end = middle-1;
                }else{
                    start = middle +1;
                }
            }
            if (arr[middle]==target){
                return middle;
            }
        }
         if (rev){
             return end;
         }else{
            return start;
         }
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean rev = arr[start]>arr[end];
        while (end >= start){
            int middle = start + (end - start)/2;
            if (rev){
                if (target>arr[middle]){
                    end = middle-1;
                }else{
                    start = middle +1;
                }
            }else{
                if(target<arr[middle]){
                    end = middle-1;
                }else{
                    start = middle+1;
                }
            }
            if (target == arr[middle]){
                return middle;
            }
        }
        return end;
    }
    public static void main(String[] args){
//        int[] arr = {21,14,8,6,4,3};
        int[] arr = {1,3,5,7,9,23,45,78,90};
        //           0 1 2 3 4  5  6  7 8
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter the target element: ");
            int t = input.nextInt();
            System.out.printf("floor: %d%nCeiling: %d%n",floor(arr,t),ceiling(arr,t));
        }
    }
}
