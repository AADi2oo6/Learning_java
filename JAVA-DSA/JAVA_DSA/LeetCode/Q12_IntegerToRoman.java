package JAVA_DSA.LeetCode;

public class Q12_IntegerToRoman {
    static char roman(int x){
        return switch(x){
            case  1->'I';
            case 10->'X';
            case 5->'V';
            case 50->'L';
            case 100->'C';
            case 500->'D';
            case 1000->'M';
            default -> 'O';
        };
    }
    static String intToRoman(int x ){
        int digits  = (int)(Math.log10(x))+1;
        int len = digits;
        String roman = "";
        for(int i = 0;i<digits;i++){

        }
        return "))";
    }

    public static void main(String[] args) {
        System.out.println((int)(Math.log10(1234))+1);
        System.out.println();
    }
}
