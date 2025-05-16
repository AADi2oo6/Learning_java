import java.util.Scanner;

public class o4_Functions {
    static int sum(int x, int y){// this is the function which returns a int value
        return x+y;
    }
    public static void main(String[] args) {
        //This is the Main Function :->
        System.out.print("Enter the value of x and y : ");
        Scanner data = new Scanner(System.in);
        int x = data.nextInt();
        int y = data.nextInt();
        System.out.println(sum(x,y));
        data.close();
        int a=1,b=2;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(String.format("%d and %d", a,b));

    }
}
