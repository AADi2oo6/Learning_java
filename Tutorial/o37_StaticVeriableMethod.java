// the static keyword is used to create a veriable in method whose name will be same for all the objects created in the methods
class Mobile{
    String Brand;
    int price;
    static String BattryType;// hear the static represents that all the moble will have the same battry
    public void discriptin(){
        System.out.println(String.format("Moblile Compeny : %s ; price : %d.00 Rs , Battry Type : %s ;",Brand,price,BattryType));
    }


    // Now lets create a static Method in java 
    public static void info(){
        System.out.println("This is the content of the static method");
        // NOTE: only a static veriable can be called inside a static Method;
        System.out.println(String.format("Battry type of the Moble is %s",BattryType)); 
    }
    // you you can also use the non static veriable inside the Static method with the help of "Object REference"
    public static void data(Mobile MobileObj){
        System.out.println(String.format("Moblile Compeny : %s ; price : %d.00 Rs , Battry Type : %s ;",MobileObj.Brand,MobileObj.price,BattryType));
    }

}
public class o37_StaticVeriableMethod {
    public static void main(String args[])
    {
        Mobile.BattryType = "li-ion";// as battry type is a static we have to use class name to create the object;
        Mobile aditya = new Mobile();
        aditya.Brand = "Realmi";
        aditya.price = 12000;
        aditya.discriptin();

        Mobile aryan = new Mobile();
        aryan.Brand = "Apple";
        aryan.price = 59000;
        aryan.discriptin();
        // battary type = li-lion will be set autometically for both aditya and aryan as battry type is static function and we have definced the static function as "li-ion"
        System.out.println("------------------StaticMethod-------------------");

        //------STATIC METHOD-----
        // Mobile.show() : will give an error as show is not a static method
        //Therefore you can't call a method with the help of a class name
        Mobile.info(); // This is a static method and can be called with the help of Class Name

        //printing non static veriable using static Method
        Mobile.data(aditya);
        Mobile.data(aryan);
          
    }
}
   


//Imp question : Why is the main function is a static funtion
// If Main function was not static, we would have to create a an object for the class to run the main Method 
// Hence if the Main function will be static we don't have to create an object for the class and directly execute the progream