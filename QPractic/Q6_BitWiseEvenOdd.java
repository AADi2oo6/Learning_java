import java.util.Scanner;
public class Q6_BitWiseEvenOdd {
//    Q: check a given number is even or odd using bitwise operator
public static void main(String[] args) {
    // 1. AND(&) : n&1 = 1 ; (if n is single digit) else
//                  (10101&1) = 1(return the same number at the 0th position of the binary number)
//                   the above convertd to : 10101 & 00001 = 1
// if 0th digit of a binary number is 1 => number is odd as it will have 1*2^0;
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    String resutl = (((x&1)==0))? "The number is Even ":"The number is Odd";
    System.out.println(resutl);

}
}
