// import java.lang.classfile.instruction.ConstantInstruction.ArgumentConstantInstruction;


import java.util.Scanner;
public class tempCodeRunnerFile{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The value of X and Y : ");
        int x = input.nextInt();
        int y = input.nextInt();
//        System.out.println(String.for);
        if (x>y){
            System.out.println(String.format("X : %d is greater then Y : %d",x,y));

        }
        else {
            System.out.println(String.format("Y : %d is greater then X : %d",y,x));

        }
    }
}