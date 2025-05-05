//in this an object is creasted without its name 
//They can be called once only 
class A {
    public A(){
        System.out.println("A new object is created !");
    }
    public void show(){
        System.out.println("Show is called");
    }
}

public class o46_AnonymusObj {
    public static void main(String[] args) {
        //normal way of creating an object is :
        A obj = new A();
        obj.show();
        //for anonymus object we use the following syntax: 
        new A().show(); //Note Can't use the same object again ;  
    }
}
