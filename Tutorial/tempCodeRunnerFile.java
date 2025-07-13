// import java.lang.class file.instruction.ConstantInstruction.ArgumentConstantInstruction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class tempCodeRunnerFile{
    static void swap(int[] x){
//        System.out.println(l/2);
    }
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        int l = x.length;
        for(int a = 0; a < l/2 ;a++){
            x[a] = x[l-1-a]+x[a];
            x[l-1-a] = x[a]-x[l-1-a];
            x[a] = x[a]-x[l-1-a];
            System.out.println(Arrays.toString(x));
        }


        System.out.println(Arrays.toString(x));
    }
}