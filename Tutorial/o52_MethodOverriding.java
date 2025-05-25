

// in Method overriding if we create a class and inherit it from another class
// if both the class have the same method then the method in the actual class will not be called 
// instead the method which is in the actual class will be called
class A3{
    public void show(){
        System.out.println("This is of class A3");

    }
}
class B2 extends A3{
    @Override
    public void show(){
        System.out.println("This is of Class B2");
    }
}

public class o52_MethodOverriding {

    public static void main(String[] args) {
        B2 obj = new B2();
        obj.show();
    }
}
