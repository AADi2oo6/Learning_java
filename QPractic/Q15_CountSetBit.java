import org.w3c.dom.ls.LSOutput;

public class Q15_CountSetBit {
    static int setBitCounter1(int n){
        int count =0;
        while (n>0){
            if ((n&1) ==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(setBitCounter1(9));
    }
}
