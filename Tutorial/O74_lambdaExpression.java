/*
1. What is a Lambda Expression in Java
    >A lambda expression is basically an anonymous function (a block of code) that you can treat as data:
     you can pass it around (as method arguments), assign it to variables, etc
    >It helps reduce boilerplate compared to using anonymous inner classes for interfaces that have a
     single method (so-called functional interfaces).
Limitations / Things to watch
    Lambdas still need a target type (a functional interface) for the compiler to know what is being implemented.
    Variables from outer scope captured in lambdas must be effectively final.
 */

@FunctionalInterface // lambda expression must be of functional interface
interface lembdaInterface{
    void xpresion();
}

@FunctionalInterface // lambda expression must be of functional interface
interface lembdaInterfaceWithArg{
    void expression(int args);
}

@FunctionalInterface // lambda expression must be of functional interface
interface lembdaInterfaceWithMultiArgs{
    int expression(int x, int y);
}

public class O74_lambdaExpression {
    public static void main(String[] args) {
        lembdaInterface obj = new lembdaInterface() {
            @Override
            public void xpresion() {
                System.out.println("Normal Annonymous class without lambda, lengthy");
            }
        };
        obj.xpresion();

        lembdaInterface obj1 = () -> System.out.println("lembda expression");// no parimeter just one side effect
        obj1.xpresion();

        lembdaInterfaceWithArg obj2 = i -> System.out.println("the value of args is : "+i);// one paramiter don't need bracket
        obj2.expression(432);

        lembdaInterfaceWithMultiArgs obj3 = (x,y) -> x*y;// we can return directly ;
//        obj3.expression(5,3);
        System.out.println(obj3.expression(5,3));

        lembdaInterfaceWithMultiArgs obj4 = (x,y) -> {
            System.out.println("the multiple of x and y is : " + x*y);
            return x*y;
        };
        obj4.expression(5,4);



    }

}
