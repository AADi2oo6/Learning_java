import java.sql.Array;
import java.util.Arrays;

public class TempQuestion {
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void bubbleSort(int[] arr,int j,boolean swaped){
        if(j > arr.length-1|| !swaped){
            return ;
        }
        for(int i =0; i<arr.length-1-j;i++){
            if(arr[i]>arr[i+1]){

                swap(arr,i,i+1);
                System.out.println(Arrays.toString(arr));
                swaped = true;
            }
            else{
                swaped = false;
            }
        }
        j= j+1;
        bubbleSort(arr,j,swaped);


    }
    static void bubble(int[] arr, int r, int c){
        if(r==arr.length-1){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                swap(arr,c,c+1);
            }
            bubble(arr,r,c+1);
        }
        else{
            bubbleSort(arr,r-1,0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        bubbleSort(arr,0,true);
        System.out.println(Arrays.toString(arr));
    }
}

