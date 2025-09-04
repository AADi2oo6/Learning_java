package Recursion.strings;
//Q Given a String you have to skip a word let "Apple;
public class SkipAWordInString {
    static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        char at0 = s.charAt(0);
        if (s.startsWith("apple")){
            //if string s starts with apple skip 5 char (for apple) and the pass the string

            return skipApple(s.substring(5));
        }
        else{
            //if s don't start with apple skip one char and then check again
            return at0+skipApple(s.substring(1));
        }
    }

    public static void main(String[] args) {
        String s = "AappledityaappleLove";
        System.out.println(skipApple(s));
    }

}
