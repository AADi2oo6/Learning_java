

class mobile{
    static String Brand;
    int price;
    String name;

    static{
        Brand = "None";
        System.out.println("Static block is called only once; AT The STARTIng");
    }
    //we can initilise the veriable inside the constructor 
    public mobile(){
        price = 00;
        name = "-----"; 
        System.out.println("Consturctor is called for changing its value");
        // therefore everytiem a new object will be created this block will be called and price and name will be changed;

    }

    public void show(){
        System.out.println(String.format("Brand : %s ; Price : %d ; Name : %s ;",Brand,price,name) ) ;
    }
}
class Dummy{
    static String Name;
    static{
        Name= "Not Avilable";
        System.out.println(String.format("Static Block claeed without object creatinon : Name = %s",Name));
    }
}

public class o39_StaticBlock {
    public static void main(String args[]) throws ClassNotFoundException
    {   
        
        mobile apple = new mobile();
        apple.name = "16pro";
        apple.price = 122999;
        // mobile.Brand = "Apple";
        apple.show();
        
        
        mobile realme = new mobile(); // each time a new object will be created constructor will be called;
        realme.show();
        

        System.out.println("=============calling Class without Object ++++++++++++++++++++");
        // NOTE if you don't create any object the class will not call the static block 
        // but if you want to call the static block without creating the object you can use the class class method:
        Class.forName("Dummy");// it throws an exception so i have added exception handiling on the main();
        //Hence, The above like can be use ot load the class
    }
}
