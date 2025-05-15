// in java we use "final" keyword to create a constant function eg. a class or an object etc
// if the object is said to be final we can't chage its value or if the class is started with final then we can't inharit it

final class calc{
    public int add(int x,int y){
        return x+y;
    }
}


public class o57_FinalKeyword {
    public static void main(String[] args) {
        final int z = 123;// now we can't change the value of the z ;
        System.out.println(z);
    }
}