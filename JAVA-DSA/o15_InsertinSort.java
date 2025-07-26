import java.util.Arrays;

public class o15_InsertinSort {
    public static void main(String[] args) {
        int[] arr= {};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
    static void insertionSort(int[] arr){
        for(int i= 0 ; i <arr.length-1;i++){

            for(int j = i+1; j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }
}
