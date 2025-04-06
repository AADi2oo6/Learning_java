// with the help of incapsulation we can make the data of a class private

class Employee{
    private int id ;
    private int salary;
    String name ;

    public void setIdSalary(int Id, int Salary){
        id = Id;
        salary = Salary;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }

}

public class o40_Encapsulation  {
    public static void main(String args[])
    {
        Employee Adi = new Employee();
        Adi.setIdSalary(15040,200000);
        System.out.println(String.format("Id : %d \nSalary : %d",Adi.getId(),Adi.getSalary()));
    }
    
}
