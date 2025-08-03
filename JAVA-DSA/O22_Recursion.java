public class O22_Recursion {
    static int factorial(int x){
        if (x<=1){//base condition
            return 1;
        }
        else {
            return x*factorial(x-1);
        }
    }
    static void print(int x){
        System.out.println(x);
        if (x-1!=0){
            print(x-1);
        }
        return ;// for breaking the loop;

    }
//    find n'th hibachi
    static int fabonachi(int n){
        if(n<2 && n>=0){//base condition
            return n;
        }
        return fabonachi(n-2)+fabonachi(n-1);
    }
    static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1; // base case: not found
        }

        int middle = start + (end - start) / 2;

        if (arr[middle] == target) {
            return middle; // base case: found
        }

        if (arr[middle] < target) {
            return binarySearch(arr, middle + 1, end, target); // ← return the result
        } else {
            return binarySearch(arr, start, middle - 1, target); // ← return the result
        }
    }


    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        print(10);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,0,arr.length,7));
//        System.out.println(fabonachi(6));
    }
}
