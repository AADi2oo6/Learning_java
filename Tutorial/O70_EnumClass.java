// Enum by default extends Enum class
// we can create our own methods inside the enums
enum acer{
    Nitro(70000), aspire(50000),Ligen, predator(100000), swift(60000) ;

    private int price;
    private acer(){// creating a default constructor
        price = 100;
    }

    private acer(int price){
        this.price = price;
    }
    int getPrice(){
        return price;
    }
    void setPrice(int price){
        this.price = price;
    }
}

public class O70_EnumClass {
    public static void main(String[] args) {
        acer[] laptop = acer.values();

        for (acer l : laptop){

            System.out.println(l+" "+l.getPrice());
        }
    }
}
