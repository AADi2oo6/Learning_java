public class Q8_BitWise_findNthBit {
//   Q: given a number find the i th bit of the number;
    public static void main(String[] args) {
        int n = 182;
        int i = 7;
        System.out.println(n&(1<<i-1));
//        OR
        System.out.println(n&((int)(Math.pow(2,i-1))));
    }
}
