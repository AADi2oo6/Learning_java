import java.sql.Array;
import java.util.Arrays;


public class O30_OOP_1 {

    public static void main(String[] args) {
        students[] vit = new students[4];
        students aditya  = new students();
//        aditya.name = "Aditya Sharma";
//        aditya.marks = 9.23;
//        aditya.rno= 73 ;
//        System.out.println(aditya.name);

        System.out.println(aditya.name);

        System.out.println(aditya.rno);
        // -------FINAL KEYWORD-------//
    //    note : final keywords are all capital
    //    they can't be modified
        final int RESULTS = 9;
    //    RESULTS = 10;
        final float marks= 1.1f; // immutable ONLY if data type is PRIMITIVE
        final TestFinal DATA = new TestFinal("Aditya Sharma");
        // the above line means that the reference variable DATA cannot be changed to point another object one it has been initiated
        DATA.name = "aditay";// we can change the value of name as name is not final in the class;
//        DATA = new TestFinal("Other object");// this wil throw an error


        // Static keyword part(from oop 2)------------------------------
        Human1 Aditya = new Human1("aditya",12);


        System.out.println(Human1.population);


    }
}

class TestFinal{
//    final int x ; will throw error as it is not initialised
    final int x = 10; // final are always initialised while declaration
    String name ;
    public TestFinal(String name ){
        this.name = name;
    }
}


class students{
    int rno ;
    String name ;
    double marks ;


  // we need a way to add the value to the above properties object by object(solution : Constructor)
    // we need one word to access every object  (solution : this)
    students(int rno, String name,double marks){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }

    // how to call constructor from another constructor
    students(){
        this(73,"Aditya Sharma",9.75); // calling other constructor using this constructor

    }
}
