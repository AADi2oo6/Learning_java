package Recursion;

import org.w3c.dom.ls.LSOutput;

public class SumOfDigits {
    static int digitsSum(int x){
        if(x == 0){
            return 0;
        }
        int remender = x%10;
        return x%10 + digitsSum(x/10);
    }

    public static void main(String[] args) {
        System.out.println(digitsSum(1234));
        System.out.println((int)(Math.log10(123)+1)); // this returns the lenght of the digits
    }
}
