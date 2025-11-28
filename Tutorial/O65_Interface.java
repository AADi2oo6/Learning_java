
// Interface are not a class
// by default every methon in interface is public abstract
//IMP : we can createa an object of interface but can't intensiate the type A
interface Animal{

    int age=0 ;// all veariable inside the interface are static final
    void legs();
    void type();// by default public abstract

}
class tiger implements Animal{// you we fail to implement any of interface method the class will become abstract
    public void legs(){
        System.out.println("4 legs");
    }
    public void type(){
        System.out.println("Dangerous");
    }
}

// Types of Interface :
/*
    1. Normal Interface : interface with 2 or more interface
    2. SAM(Single abstract method interface) / Functional Interface : Interface with only one method
    3. Marker Interface : Interface with no methods ( Blank Interface) ;
 */
public class O65_Interface {
    public static void main(String[] args) {
        Animal cow; // we can create an object of type Interface
//        cow = new Animal();  cannot be instantiated
        cow = new tiger();

    }
}
