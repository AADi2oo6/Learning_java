import java.util.Scanner;
public class Temp {
    static int factorial(int x ){
        int Factorial = 1 ;
        for(int i=1; i<=x; i++){
            Factorial*= i;
        }
        return Factorial;
    }
    static void fibonacci(int x){
        int a=0,b=1,c ;
        if (x <2){
            System.out.print(x);
        }
        System.out.print(a+" "+b);
        for(int i =2; i<x;i++){
            c = a+b;
            a = b;
            b = c;
            System.out.print(" "+c);
        }
    }
    static int numReverse(int x){
        String Str = Integer.toString(x);

        int count = Str.length();
        int revInt = 0 ,num = x,  Rem;
        for (int i = 0; i<count;i++){
            revInt *=10;
            revInt += num%10;
            num/= 10;


        }
        return revInt;
    }
    public static void main(String[] args)  {
        // write the program ot find the factorial of a number ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = input.nextInt();
        int f = factorial(x);
        System.out.println(f);
        fibonacci(x);
        System.out.println("The revers stirng is : "+numReverse(x));
    }
}
