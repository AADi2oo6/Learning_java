public class o49_MultiLevelInharitance {
    // Structure : calc -> advCalc -> SciCalc
    public static void main(String[] args){
        SciCalc calculator = new SciCalc();
        System.out.println(calculator.add(213,123));
        System.out.println(calculator.sub(213,123));
        System.out.println(calculator.div(213,123));
        System.out.println(calculator.prod(213,123));
        System.out.println(calculator.power(5,3));
        System.out.println(calculator.root(256));
    }
}
