//for using inputs in java we need to import a package from java.utils which is scanner
import java.util.Scanner;


public class o01_InputsInJava{
    public static void main(String[] args) {
        //in System.out System is a class which contains the out variable which is initially null when we write print the null changes to the given print value;
    
        System.out.println("Inputs in java : ");

        // similar the System.in : in menus the stander input stream whos initial value is null
        // with the help of scanner class we can take inputs from user in java;
        Scanner input = new Scanner(System.in);
        // the above line means that object(input) you are a type of Scanner which will have the valuee of System.in;  
        System.out.print("Enter the value of x : ");
        int x = input.nextInt(); // this will take input int;

        System.out.print("Enter the value of y(string) : ");
        String y = input.next(); // this will take the first word of the string;
        System.out.print("Enter the value of z(string) : ");
        String z = input.nextLine(); // this will take the entire line of the string;
            
        System.out.println("The value  of z is : "+z);
        System.out.println("The value  of y is : "+y);
        System.out.println("the value of x is : "+x);

        // we can provide the value of each input stream in one go just write the values of the identifier separated with space
        // eg if  x,y,z want to take inputs we can provide it in one og like 123 Aditya Sharma 
        // now x will have 123 and y = Aditya and so on
        int num1 = input.nextInt();
        float num2 = input.nextFloat();

        System.out.println(num1+num2);

        input.close();
    }
}
