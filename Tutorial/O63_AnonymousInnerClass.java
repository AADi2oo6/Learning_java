
// inner class with name is called anonymous inner class

class RealClass{
    public void show(){
        System.out.println("This show is of RealClass");
    }
}

public class O63_AnonymousInnerClass {
    public static void main(String[] args) {
        RealClass obj = new RealClass()
        {// anyonomous inner classs just like creating a new class and overding the show function
            public void show()
            { // method overriding
            System.out.println("this is inside the anonymous inner class");
            }
        };
        obj.show();
    }
}
