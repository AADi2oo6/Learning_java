

// in Method overridig if we create a class and innharit it from another class 
// if both the class have the same method then the method in the actual class will not be called 
// instead the method which is in the actual calss will be called
class A{
    public void show(){
        System.out.println("This is of class A");

    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("This is of Class B");
    }
}

public class o52_MethodOverriding {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
