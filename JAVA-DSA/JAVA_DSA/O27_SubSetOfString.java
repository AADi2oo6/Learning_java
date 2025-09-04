package JAVA_DSA;
public class O27_SubSetOfString {
//Q: Given a string s Find all the subset of s
    static void subset(String up,String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char at0= up.charAt(0);

//        now making two recursion call one for take-It case and one for Ignore-it case
        subset(up.substring(1),p+at0);//take-it
        subset(up.substring(1),p);//ignore case


    }

    public static void main(String[] args) {
        subset("abc","");
    }

}
