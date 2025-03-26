class o9_ArathmaticOperators{
    public static void main(String args[]){

        //hear we are going to preform various arathmetic opperator
        int a = 7;
        int b = 5;
        int result = a/b;  // '/' will only give the Questiont part of the solution
        double r = a/b; // will return the saMe only Questiont
        int result1 = a%b;// will return the remender part of the solution 
        System.out.println(result);
        System.out.println(r);
        System.out.println(result1);

        // int b = b + 2;
        b += 2 ; //both are correct
        System.out.println(b);  
        b++; // will increasse the value of the b by 1
        System.out.println(b);

    }
}