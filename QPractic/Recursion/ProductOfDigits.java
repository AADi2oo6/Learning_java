package Recursion;
// given a number 2343 return the product of every digits in that number
public class ProductOfDigits {
    static int digitsProduct(int x ){
        if (x%10 ==x ){// checking if we are at the last digit
            return x;
        }
        return x%10*digitsProduct(x/10);
    }

    public static void main(String[] args) {
        System.out.println(digitsProduct(234));
    }
}
