public class o17_String {
    public static void main(String[] args){
        String Name = "Aditya Sharma";// this is a way to declare the string
        System.out.println(Name);

//        We know there are two types of memories stack and heap
//        inside the heap there is a pool memory where the objects of string are stored
//        the main point is that in pool if two variable have the same values then no new object is created
//        both the variable will point to the same variable

//        STRING COMPARISON       //
        String a = "Adi";// the both the variable a and b are pointing to the same
        String b = "Adi"; //  object "Adi" in the Pool Memory
        Boolean eqal = a==b; // therefore this will return true
        System.out.println(eqal);

//        Now if we create two different object's
        String x = new String("Adi");
        String y = new String("Adi"); // now both x and y are pointing to separate objects
        System.out.println(x==y); // this will return false

//       ThereFore for comparing the values use .equal() Method
        System.out.println(x.equals(y)); // this will return ture(comparing only values)

//        how to fetch the character at a particular index of a string
        for(int i =0; i<Name.length();i++){
            System.out.println(Name.charAt(i));
        }
    }
}
