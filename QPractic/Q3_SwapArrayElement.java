import java.util.Arrays;
import java.util.Scanner;

public class Q3_SwapArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Q. Swap the element at two index of the array
        int[] array = {2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the Swaping indexes : ");
        swap(array,input.nextInt(),input.nextInt());
        System.out.println(" Modified Array: "+ Arrays.toString(array));


        int[] x = {1,2,3,4,5};
        int l = x.length;
        for(int a = 0; a < l/2 ;a++){
            x[a] = x[l-1-a]+x[a];
            x[l-1-a] = x[a]-x[l-1-a];
            x[a] = x[a]-x[l-1-a];
            System.out.println(Arrays.toString(x));
        }

    }

    static void swap(int[] array ,int i1, int i2){
        array[i1] = array[i1]^array[i2];
        array[i2] = array[i1]^array[i2];
        array[i1] = array[i1]^array[i2];

    }
}
