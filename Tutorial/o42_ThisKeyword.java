class Employee1{
    private int id ;
    private int salary;
    String name ;

    public void setIdSalary(int id, int salary){
        this.id = id;
        this.salary = salary;  //this keyword can be used to acces the instance veriable inside the method withe the same name
    }
    public int getId(){ // this are getter and setter of java
        return id;
    }
    public int getSalary(){
        return salary;
    }


}


public class o42_ThisKeyword {
    public static void main(String args[])    
    {
        System.out.println("This is the o42");
        Employee1 Aditya = new Employee1();
        Aditya.name = "Shahil Sharma";
    }
}
