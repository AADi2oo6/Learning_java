import java.util.Scanner;

public class O23_BitWiseOperators {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
//      1. AND(&) : n&1 = 1 ; (if n is single digit) else
//                  (10101&1) = 1(return the same number at the 0th position of the binary number)
//        the above convertd to : 10101 & 00001 = 1

//  Q: Check wether a given number is even or odd:
        // if 0th digit of a binary number is 1 => number is odd as it will have 1*2^0;
        String isEven = (x&1)==0 ? "the number is Even ":"The number is False";

//      3. XOR(^) : if any one is true then only ture(if and only if)
//        n^n = 0 and n^0= 1 always;
//        NOTE: while taking xor order don't matter

//  Q: find the number in an array of number which is not repated
        int[] arr = {1,2,3,4,1,2,3,4,5};
        int result=0;
        for(int i:arr){
            result^=i;
        }
        System.out.println("Not repeated: "+result);
    }

//    4. Left shift opperator(<<)
//    num<<n shift n bits left from the num and addes n zeroes
//    eg( 11101001<<3 = 11101001000)

//    5.Right Shift(>>)
//    eg(11101001>>3 = 11101)
}
