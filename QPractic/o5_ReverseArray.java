import java.util.Arrays;

public class o5_ReverseArray {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,1};
        System.out.println("The array = "+Arrays.toString(array));
        reverse1(array);
        reverse(array);
        System.out.println("the array = "+Arrays.toString(array));
    }
    static void reverse1(int[] arr){
        //method 1 : create a new shorted array
        int[] Marray = new int[arr.length];
        int start = arr.length-1;
        int end = 0;
        for(int i = start; i >=0 ; i--){
//            System.out.println(arr[i]);
            Marray[start - i] = arr[i];
        }
        System.out.println(Arrays.toString(Marray));

    }
    static void reverse(int[] arr){
        // this will modify the existing array to new ;
        int start=arr.length-1;
        int end = 0;
        while (start > end){
            swap(arr,start,end);
            start-=1;
            end +=1;
        }
    }
    static void swap(int[] array ,int i1, int i2){
        array[i1] = array[i1]^array[i2];
        array[i2] = array[i1]^array[i2];
        array[i1] = array[i1]^array[i2];

    }

}
