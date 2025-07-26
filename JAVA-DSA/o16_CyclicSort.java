import java.util.Arrays;

public class o16_CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
//    static void cyclicSort(int[] arr){
//        for(int i =0 ; i<arr.length;i++){
//            while (i!=arr[i]-1){
//                swap(arr,i,arr[i]-1);
//            }
//        }
//    }
    static void cyclicSort(int[] arr){
        int i = 0 ;
        while (i <arr.length){
            int correct = arr[i] -1 ;// this represents the correct index for element at i
            if (arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }
}
