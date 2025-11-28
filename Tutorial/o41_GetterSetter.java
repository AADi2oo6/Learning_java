import java.util.Arrays;

class Emp{
    private int id ;
    private int salary;
    String name ;

    public void setIdSalary(int id, int Salary){
        this.id = id;
        salary = Salary;
    }
    public int getId(){ // this are getter and setter of java
        return id;
    }
    public int getSalary(){
        return salary;
    }

}

public class o41_GetterSetter {
    public static void main(String args[])
    {
        System.out.println("T");
        Emp Aditya = new Emp();
        Aditya.name = "Aditya Sharma";
        String lion[] = new String[] {};
        int[] a = new int[0] ;
        System.out.println(Arrays.toString(lion)+"------------");
        System.out.println(a.length);

    }
}