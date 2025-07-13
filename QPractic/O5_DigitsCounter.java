
// in this we will calculate different ways to count digits of a number ;
public class O5_DigitsCounter {
    static int Method1(int x){
        String str = x+"";// or
//        String s = String.valueOf(x);
        return str.length();
    }
    static int Method2(int x){
        int result = 0 ;
        while(x>0){
            result+=1;
            x /=10;
        }
        return result;
    }
    static int Method3(int x){
        return (int)(Math.log10(x))+1;
    }
    public static void main(String[] args) {
        System.out.println(Method1(123241));
        System.out.println(Method2(123241));
        System.out.println(Method3(123241));
    }
}
