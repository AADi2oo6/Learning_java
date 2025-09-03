package JAVA_DSA.LeetCode;

public class Q13_RomanToInteger {
    static int roman(char c){
        return switch (c){
            case 'I' -> 1;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    static int romantoint(String s){
        char[] ch = s.toCharArray();
        int sum  = 0;
        for(int i = 0; i <ch.length-1;i++){
            int ch1 = roman(ch[i]);
            int ch2 = roman(ch[i+1]);
            if(ch1< ch2){

                sum-=ch1;
            }
            else{
                sum+=ch1;
            }
        }
        sum+=roman(ch[ch.length-1]);

        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romantoint(s));
    }
}
