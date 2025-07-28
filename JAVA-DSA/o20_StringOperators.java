public class o20_StringOperators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // '' represents character and odding a character its asci value gets added
        System.out.println((char)('a'+'b'));
        System.out.println("a"+"b");//"" represents string and string can be directly be added;
        System.out.println('a'+5); // this will return a number
        System.out.println((char)('a'+5));// this will return a character
        System.out.println("a"+5); // this will return a5 because 5 will be converted to toString()
        // everything inside the println is converted to tostring
    }
}
