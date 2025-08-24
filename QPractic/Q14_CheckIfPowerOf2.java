public class Q14_CheckIfPowerOf2 {
    static boolean check(int n){
        int result = (n)&(n-1);
        if(result == 0){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(check(4));
        System.out.println(9&1);
    }
}
