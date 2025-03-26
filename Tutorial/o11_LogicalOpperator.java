class o11_LogicalOpperator{
    public static void main(String args[])
    {
        //Logical operaters in java 'AND - &' 'OR - | ' 'NOT- !'
        //SHORT CIRCUIT AND and OR: AND - && ; OR- ||
        //always use shortCircuit because it is fast and saves time.
        int x = 234;
        int y = 233;
        double a = 11.12;
        double b = 45.232;

        boolean result1 = x>y && a>b;
        System.out.println(result1);

        boolean result2 = x>y || a>b;
        System.out.println(result2);
        System.out.println(!result2);

    }
}