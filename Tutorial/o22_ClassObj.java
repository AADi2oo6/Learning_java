class calculator{
    public int disp(){
        System.out.print("The number is : ");
        return 10;
    }
    public int add(int x, int y){
        System.out.print("The Sum of "+x+" And "+y+" is : " );
        System.out.printf("The sum of the %d and %d is : ",x,y);
        return x+y;
    }
}
public class o22_ClassObj{
    public static void main(String args[]){ 
        int x = 234;
        System.out.println("the Value of x is : "+x);

        calculator calc = new calculator(); // this is the syntax to create a new object of class calculator
        calc.disp(); // this is the syntax to call the method of class calculator ;
        int result = calc.disp(); // this is the syntax to get the return from the method; 
        System.out.println(result);

        int sum = calc.add(21,42);
        System.out.println(sum);
    }
}