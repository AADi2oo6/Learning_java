public class O31_OOP_2 {


    public static void main(String[] args) {

        Human1 adi = new Human1("Aditya",19);
        Human1 avi = new Human1("Avinash",21);
        System.out.println(Human1.population);

        //NOTE : every non-static need an object to run else they will raise an error
        // Static function or class don't need an object to run hence main function is always a static function

//        greet(); This gives error because greet is a part of O31_OOP_2 class and it don't have an object
        O31_OOP_2 obj = new O31_OOP_2();
        obj.greet();// now this can run as the boject is now crreated

        // a non-static can run inside a non-static if the other non-static has an object defined
        obj.greet();


    }
    void greet(){
        name();
        System.out.println("Hellow How are YOU!!");
    }
    void name(){
        System.out.print("Aditya ");


    }



}
//-----STATIC KEYWORD----
//-A static variable belongs to the class itself not to any
//specific object(instance) of that class.
//-All object of the class shear the same single copy of the
//static variable.
class Human1{
    public String name;
    int age;
    public static int population=0; // hear population is a static variable
    //so the value of population will be same for all the Objects of the class Human1.

    public Human1(String name,int age){
        this.name = name;
        this.age = age;
        //this keyword is not used with static methods or veriabes we use class name ins
        population+=1;//Static variables are always used with class Name by convension;

    }
}
