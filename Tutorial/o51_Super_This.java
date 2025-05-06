// whenever we create a class constructor it always contain the super();(hiddeN) function which tell the constructor the to first execute the super class(parent Class) 
class A{ // as A has NO parant class so NOTE: every class in java extends "Object" class
    public A() { // this is the constructor of the parrent class of B
        super(); // this will call the constructor class of the Obect Class
        System.out.println("In Constructor A");

    }
    public A(int x){ // parameterized constructor
        super(); // this is default
        System.out.println("In Parametrized Constructor A "+x);

    }
}

class B extends A{
    public B(){
        super(); // this is always present in the constuctor which tells to first exectue the parant class constructor(with no parameter);
        System.out.println("In Constructor B");
    }
    public B(int x ){
        // super();// this is default ( hence will run the Constructor of A with no arguments) but if we pass a parameter inside the super it will run the constructor of A with parameter;
        // super(x);
        this(); // this will call the constructor B() and then B will execute the super() which will the constructor of the A
        System.out.println("in Parametrized Constructor B"+x);
    }
}

public class o51_Super_This {
    public static void main(String[] args) {
        B obj = new B();// this has no Parameter so will excess the constructors without Parameter;

        B obj1 = new B(123);// This has Parameter so will exces the constructor with Parameter

        // what if we want to call both the constructor of the class ( for this case we need to use the "this();" instead of the super() )

        System.out.println("Using the this keyword for calling the constructor");
        B obj2 = new B(234);
    }
}
