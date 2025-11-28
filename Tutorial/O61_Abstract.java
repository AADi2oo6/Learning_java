// abstract is an keyword which can be put before class or method name;
// abstract method are the methods which are decleard in abstract class but don't have any body;
// abstract methods can only be created inside the abstract class;
// abstract class may or may not have the absract class,
// abstract class can have normal methods also
// NOTE: All Abstract methods must be defined inside the class which is extending the abstract class
// IMP> Can't create an object of abstract class
// but we can do this : AbstractClass Obj = new extendedClass(); // this is possible
/*
Abstract classes (incomplete classes) // always public
Abstract methods (incomplete methods)
An abstract class is a class that:
1.Cannot be instantiated
2.Can contain abstract methods (unimplemented)
3.Can also contain concrete methods (implemented)
3. A class having even one abstract method must be declared abstract
4. Constructors are allowed in abstract classes
5. Abstract methods cannot be private
6. Abstract methods cannot be final
7. Abstract class can have static methods
8. You cannot declare an abstract constructor x
9. You can declare abstract classes without abstract methods



 */
abstract class car{
    public void playMusic(){// concrete method
        System.out.println("Playing Music>>!");
    }// normal class inside the abstract class (NO ISSUE)

    public abstract void company();
    public abstract void drive();


}
class Mahindra extends car{// concrete class
    public void company(){
        System.out.println("This is the Mahindra co.");
    }
    public void drive(){
        System.out.println("Driving Mahindra Thar !!");
    }
}
public class O61_Abstract {
    public static void main(String[] args) {
//        car myCar = new car();// this will give error
        car myCar = new Mahindra();
        myCar.company();
        myCar.drive();
        myCar.playMusic();

    }
}
