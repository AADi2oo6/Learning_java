// whenever we create a class constructor it always contain the super();(hiddeN) function which tell the constructor the to first execute the super class(parent Class) 
class A2{ // as A2 has NO parant class so NOTE: every class in java extends "Object" class
    public A2() { // this is the constructor of the parrent class of B3
        super(); // this will call the constructor class of the Obect Class
        System.out.println("In Constructor A2");

    }
    public A2(int x){ // parameterized constructor
        super(); // this is default
        System.out.println("In Parametrized Constructor A2 "+x);

    }
}

class B3 extends A2{
    public B3(){
        super(); // this is always present in the constuctor which tells to first exectue the parant class constructor(with no parameter);
        System.out.println("In Constructor B3");
    }
    public B3(int x ){
        // super();// this is default ( hence will run the Constructor of A2 with no arguments) but if we pass a parameter inside the super it will run the constructor of A2 with parameter;
        // super(x);
        this(); // this will call the constructor B3() and then B3 will execute the super() which will the constructor of the A2
        System.out.println("in Parametrized Constructor B3"+x);
    }
}

public class o51_Super_This {
    public static void main(String[] args) {
        B3 obj = new B3();// this has no Parameter so will excess the constructors without Parameter;

        B3 obj1 = new B3(123);// This has Parameter so will exces the constructor with Parameter

        
        // what if we want to call both the constructor of the class ( for this case we need to use the "this();" instead of the super() )
        
        System.out.println("Using the this keyword for calling the constructor");
        B3 obj2 = new B3(234);
        System.out.println(obj2+obj2.toString());
    }
}
