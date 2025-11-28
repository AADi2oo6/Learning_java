//NOTE : Every class extends Object Class it is always there even without wirting
// Hence we will ge given various predefined methods to preform on any class
// eg : toString(),equls,  hashcode etc
class Laptop_{
    int price = 123;
    String model;
    public String toString(){// method overriding
        return model + " : " + price;
    }
}

public class O58_ObjectClass {
    public static void main(String[] args) {
        Laptop_ obj = new Laptop_();
        Laptop_ obj2 = new Laptop_();
        obj.model= "Nitro V";
        obj.price= 75000;

        System.out.println(obj);// every time we try to print the obj it class obj.toString() method
        int x = obj.price>=obj2.price ? 1:0;

    }
}
