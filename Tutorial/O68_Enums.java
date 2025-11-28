import java.sql.SQLOutput;

// just like in SQL
enum status {// we have created an (consider it as class) which can have different values;
    Success, Failed, Pending, Processing;

}

public class O68_Enums {
    public static void main(String[] args) {
        // we can treate enums like a class
        status current = status.Success;
        System.out.println(current);

        status[] s = status.values() ;
        for(status ss: s ){
            System.out.println(ss.ordinal()+" -> "+ss);
        }

//        if else on status
        if(current == status.Success){
            System.out.println("done!!");
        }
        else if (current == status.Pending){
            System.out.println("Please Wait");
        }
        else{
            System.out.println("Something Went Wrong");
        }

        // witch case in hear
        switch (current){
            case status.Success -> System.out.println("Task Done !!!");
            case status.Pending -> System.out.println("Processing Please Waite !! ");
            default -> System.out.println("Task Failed, Try again later!! ");
        }
    }
}
