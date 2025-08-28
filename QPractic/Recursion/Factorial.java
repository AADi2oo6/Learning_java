package Recursion;

public class Factorial {
    static int factO(int x){
        if(x<=1){
            return 1;
        }
        return x*factO(x-1);
    }
    public static void main(String[] args){
        System.out.println(factO(5));
    }
}

