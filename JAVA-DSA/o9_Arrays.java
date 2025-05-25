import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class o9_Arrays {

    // in this we will be learning arrays in java
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array of Int : ");
        int[] array = new int[5];
        for (int i = 0 ; i<5; i++ ){
            array[i] = input.nextInt();
        }
        for (int i : array){
            System.out.println(i);
        }

        // this is the method used to print the array
        System.out.println(Arrays.toString(array));
        InterChange(array);
        System.out.println(Arrays.toString(array));

        //lest create an array of String :
        String[] StrArray = new String[5];
        System.out.print("Enter the Strings : ");
        for (int i = 0 ; i< StrArray.length;i++){
            StrArray[i] =input.next();
        }
        for (String x : StrArray){
            System.out.println("Elements of Array String is :"+ x);
        }
        // another way of printing the array is with the help of toString method

        System.out.println(Arrays.toString(StrArray));

    }
    static void InterChange(int[] arr){
        arr[0] = arr[0]^arr[arr.length-1];
        arr[arr.length-1] = arr[0]^arr[arr.length-1];
        arr[0] = arr[0]^arr[arr.length-1];
    }
}
