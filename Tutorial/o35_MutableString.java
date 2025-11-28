import java.sql.SQLOutput;

//stirngbuffer and string builder in java
public class o35_MutableString {
    public static void main(String args[])
    {
        String s = "Hellow World";
        s += "! Aditya"; // this is not changing the string 
        System.out.println(s);

        StringBuffer ms = new StringBuffer();
        int bufferStringLength = ms.length(); //will give us the name of the bufferstring 
        // NOTE initial lenght of the bufferString is 16;// now it is 0

        ms = new StringBuffer("Aditya");

        System.out.println(String.format("Initial lenght of the string is : %d and final lenght : %d ",bufferStringLength,ms.length()));

        ms.append(" Sharma");//we can append the value of the string;
        System.out.println(ms);

        // we can conver the buffer to string ;
        String st= ms.toString();
        System.out.println(st);

        // we can delete an element at any index in bufferstring
        ms.deleteCharAt(6);
        System.out.println(ms);

        ms.delete(0,6);
        System.out.println(ms);
        
        // StringBuffer BufferFromString= new StringBuffer(s);
        
        // wecan also insert element at any index
        ms.insert(0,"Aditya ");
        System.out.println(ms);


        System.out.println(ms.charAt(4));
        // ms.charAt(9); will print character at any index
        System.out.println(ms.isEmpty());

        ms.replace(1,4,"___"); // will raplace the incex 1,4 with ____
        System.out.println(ms);

        ms.reverse();//will reverse the string
        System.out.println(ms);

        ms.substring(2,8);//this will store the value of the string from index2 to 8;
        System.out.println(ms.substring(2,8));

        ms.ensureCapacity(40);//we can insure the minimum capacity of the string
        System.out.print(ms);

        System.out.println("<");

     //StringBuffer vs StringBuiilder
// 1. StringBuffer is threat safe
        
    }
    
}
