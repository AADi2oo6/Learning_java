class Human{
    private String Name;
    private int Age;
    public Human(){ // This is the default constructor which take no Values
        Name = "Not Avilable";
        Age = 00;
        System.out.println("Constructor colled!!");
    }
    public Human(int Age,String Name){ // This is the paramaterized constructor which take values when we careate a new class Object
        this.Age = Age;
        this.Name = Name;
        System.out.println("Parameterized Constructor Colled !!");

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

public class o44_DefautlVsParamaterizedConst {
    public static void main(String[] args)
    {
        Human Aditya = new Human();
        Aditya.SetName("Aditya Sharma");
        Aditya.setAge(19);

        System.out.println(Aditya.getAge()+Aditya.GetName());
        
        Human Krish = new Human(19,"Krish Kumar");
        System.out.println(Krish.getAge()+Krish.GetName());
        
        Human Harsh = new Human();
        System.out.println(Harsh.getAge()+Harsh.GetName());

    }
}
