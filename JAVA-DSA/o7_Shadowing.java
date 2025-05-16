@SuppressWarnings("unused")

//every veriable defined in a class have its scope inside that class if try to use it in other class we can't use it but if we have created a veriable in a class and there is another class inside that calss containing the same veriable then the class's own verialb will be used and older global veriale will be shadowed
public class o7_Shadowing {
    static int x = 0;// this is a global veriable
    public static void main(String[] args) {
        System.out.println(x); // we can print the value of the x as it is global;

        int x = 123;// now the original value of the x will be shadowd with the new one;
        System.out.println(x); 
        getx();
    }
    static void getx(){
        System.out.println(x);// this function is outside the main function so it will get the global value of the x;
    }
}
