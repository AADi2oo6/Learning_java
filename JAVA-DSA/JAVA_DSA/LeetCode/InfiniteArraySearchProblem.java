package JAVA_DSA.LeetCode;
// Q:There is an array of infinite length you have to find an element from the infinite array
// means you can't use the .lenght function;
public class InfiniteArraySearchProblem {
    // in Order to solve this question we will be using chuncks method
    // instead of taking the start and end to 1st and last position
    // lets just take them in the 1st and 2nd position and increase the size in each step
    static int searchBinary(int[] arr,int target,int start, int end){ // this function will search for element in the given range(chuncks)
        while (start <= end){
            int middle = start + (end-start)/2;
            if (target>arr[middle]){
                start = middle+1;
            }
            else {
                end = middle -1;
            }
            if (target == arr[middle]){
                return middle;
            }
        }
        return -1;
    }

    // now lets create a function which will create chunks[range for start and end] and search the element
    static int searchInInfiniteArray(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target>arr[end]){ // now this while loop will find the correct range for target;
            int temp = end+1;
            end =end + (end - start +1)*2;
            start = temp;
        }

        return searchBinary(arr,target,start,end);
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,123,345,456,567,678,813,12423,53453,76576,678678,28282882};
        System.out.println(searchInInfiniteArray(arr,1));
    }
}
