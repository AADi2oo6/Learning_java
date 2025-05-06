//  I have creatred a java file named calc And now going to extend 

public class o48_Inharitance {
    public static void main(String[] args) {
        calc one = new calc();//when the object of calc is created then only the calc.java file will be compiled autometically.
        System.out.println("The sum of the value is : "+one.add(123,123));

        // now i am going to create a new file advCalc.java which will inharit the funciton of the calc.java
        advCalc Calc = new advCalc();
        // now i can use functions of both calc and advCalc
        System.out.println(Calc.add(213,123));
        System.out.println(Calc.sub(213,123));
        System.out.println(Calc.div(213,123));
        System.out.println(Calc.prod(213,123));
        
    }
}
