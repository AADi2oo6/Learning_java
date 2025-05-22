import java.util.Scanner;
public class Temp {
    static int factorial(int x ){
        int Factorial = 1 ;
        for(int i=1; i<=x; i++){
            Factorial*= i;
        }
        return Factorial;
    }
    public static void main(String[] args)  {
        // write the program ot find the factorial of a number ;
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int f = factorial(x);
        System.out.println(f);
    }
}
