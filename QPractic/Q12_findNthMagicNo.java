public class Q12_findNthMagicNo {
    /*
    * 1st magic no = 001 = 0*5^3 + 0*5^2 + 1*5^1 = 1
    * 2nd magic no = 010 = 0*5^3 + 1*5^2 + 0*5^1 = 25
    * 3nd magic no = 011 = 0*5^3 + 1*5^2 + 1*5^1 = 30
    */
    static int nthMagicNO(int n){
        int result = 0;
        for (int i = 0; i < 4;i++){
            int mask = 1<<i;
            if((n&mask)!=0){
                result += (int)Math.pow(5,(i+1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(nthMagicNO(6));
    }
}
