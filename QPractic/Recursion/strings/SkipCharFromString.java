package Recursion.strings;
//Q Given a string skip char 'a' from the string
public class SkipCharFromString {
    static void skipA(String s,String ans){
        // initially value of ans will be "";
        if(s.isEmpty()){
            System.out.println(ans);
            return ;
        }
        else if(s.charAt(0)=='a'){
            skipA(s.substring(1),ans);
        }
        else {
            skipA(s.substring(1),ans+s.charAt(0));
        }
    }
    static String returnSkipedA(String s){
        if(s.isEmpty()){
            return "";
        }
        char at0 = s.charAt(0);
        if(at0 == 'a'){
            return returnSkipedA(s.substring(1));
        }
        else{
            return at0+returnSkipedA(s.substring(1));
        }
    }

    public static void main(String[] args) {
        String x = "dyasaastadps";
        skipA(x,"");
        System.out.println(returnSkipedA(x));

    }
}
