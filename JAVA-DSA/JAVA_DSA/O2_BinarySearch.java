package JAVA_DSA;
import java.util.Scanner;
// How to do binary search
// 1st, arragne in assending order;
// 2nd, find the middle element and compare it with the target and change the value of start and end accordingly'
// 3dr if start>end : element not found
// if  middle == target element found
public class O2_BinarySearch {
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean rev;
        rev = arr[0] > arr[end]; // this will set rev = ture if arr[0] > arr[end]

        while (end>=start){// end will always be greater than or equals to the start
            int middle = start + (end - start)/2 ; // this the better and efficient way to find the middle value
            if (rev){
                System.out.println("reverse = "+rev);
                if (arr[middle]<target){
                    end = middle-1;
                    System.out.printf("(%d,%d)%n",start,end);
                } else if (arr[middle]>target) {
                    start = middle+1;
                    System.out.printf("(%d,%d)%n",start,end);
                }
            }
            else {
                System.out.println("reverse = "+rev);
                if (arr[middle]>target){
                    end = middle-1;
                    System.out.printf("(%d,%d)%n",start,end);
                } else if (arr[middle]<target) {
                    start = middle+1;
                    System.out.printf("(%d,%d)%n",start,end);
                }
            }
            if (arr[middle]==target){
                return middle;
            }
        }
        //means start> end =>Answer not found
        return -1;
    }

    public static void main(String[] args) {
//        System.out.println("enter string to run: ");
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.print("Enter the value to find : ");
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        System.out.println(binarySearch(arr,t));
    }
}
