//Constructor is a special method With same name as of the class
//Constructor has no return type
// Constructors can be used to initilize the values of the variables
//Constructors can be autometically called when the calls is created 
class Human{
    private String Name;
    private int Age;
    public Human(){
        Name = "Not Avilable";
        Age = 00;
        System.out.println("Constructor colled!!");
    }

    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public String GetName(){
        return Name;
    }
    public void SetName(String Name){
        this.Name = Name;
    }
}

public class o43_Constructor {
    public static void main(String[] args)
    {
        Human Aditya = new Human();
        Aditya.SetName("Aditya Sharma");
        Aditya.setAge(19);

        String Name = Aditya.GetName();
        System.out.println("The name of the object is : "+Name);

    }
}
