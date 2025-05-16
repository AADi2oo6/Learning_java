import java.util.Scanner;
public class Q1_Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        if (isPrime(num)==true){
            System.out.println("The number "+num+ " is : Prime");

        }
        else{
            System.out.println("False");
        }
        input.close();
    }
    static Boolean isPrime(int x ){
        if (x<=1){ return false;}
        for (int i = 2; i< ((int)(x/2)) ; i++){
            if (x%i ==0){
                return false;
            }
        }
        return true;
    }
}
