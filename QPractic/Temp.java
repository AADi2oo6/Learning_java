import java.util.Scanner;
public class Temp {
    static int unique(int[] x){
        int result =0;
        for(int i =0; i < 8 ; i++){
            int mask= 1<<i;
            int bitsum =0;
            for(int j : x){
                if((j&mask) !=0){
                    bitsum++;
                }
            }
            if(bitsum%3 != 0){
                result = result | mask;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] x ={1,1,1,2,2,2,3,3,3,4};
        System.out.println(unique(x));

    }
}
