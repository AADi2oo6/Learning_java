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
        this(73,"Aditya Sharma",9.75);

    }
}
