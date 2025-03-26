//Ternery Opperator
class o14_SingleLineIfElse{
    public static void main(String args[])
    {
        int x = 12;
        String result;

        // if (x%2 == 0)
        //     result= "X is an even Number";
        // else
        //     result = "x is an odd number";

        //instead of writing all those above we can use ternary opperator : Syntx given below
        //result = condition ? ifTrue : else ;
        result = x%2==0 ? "x is an even Number" : "X is an odd number";

        System.out.println(result);
    }
}