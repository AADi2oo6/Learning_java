//Dynamic Method Dispatch: with the help of this we can create a verialb of a extended calss with type of parant calss
class A{
    public void show(){
        System.out.println("This is Class A!");
    }
}
class B extends A{
    public void show(){
        System.out.println("This is class B");
    }
}

class computer{
    public void config(){
        System.out.println("Conatains CPU+GPU+RAM+ROM");
    }
}
class laptop extends computer{
    public void config1(){
        System.out.println("LightWeight, portable, energy Effecient");
    }
}
public class o56_DynamicMethodDispatch {
    public static void main(String[] args) {
        System.out.println("Now I am going to create an element of class A");
        A ObjA = new A();
        // ObjA is of object A and of type A ;
        ObjA.show();// this will print the value of the show present in the class A
        B ObjB = new B(); //  objB is of class b and type B;
        ObjB.show(); // this will show the contnet of class B because of method overridding

        // As both have the show() and B is made from A then we can create 
        A objAB = new B(); // as B is child of A we can create a reference of A form an object of B (objAB) type is A
        objAB.show();

        // more easy example to undersatnd this
        computer Acer = new laptop(); // now we can say that acer is a computer of type laptop
        Acer.config();
        // Acer.config1();

        //NOTE : So now we can say that it is possible to create an reference of super class and object of child class
        

    }
}
