// this is a unique concept in which we can crete an object of abstract class
//using anonymous inner classs
abstract class building{
    abstract void architect();
    abstract void floors();
}

public class O63_AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        // instad of creating another class from building to implement the methodds
        building house = new building(){
            public void architect(){
                System.out.println("Aditya Birla Grp");
            }
            public void floors(){
                System.out.println("total Number of floors" + 5);
            }
        };
        house.architect();
        house.floors();
//        System.out.println(house.architect());
    }
}
