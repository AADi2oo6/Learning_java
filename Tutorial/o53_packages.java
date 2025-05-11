// in java we can create a packages which can store java files we just need to add the java fils to the folder let example(tools) and now in the tools create a java file and add a linee package tools;
// NOw your package is created
import toolsPackage.advCalc;

public class o53_packages {
    public static void main(String[] args) {
        System.out.println("Priting the value of the packag:");
        advCalc obj = new advCalc();
        System.out.println(obj.prod(3,4));
    }
}
