public class Q16_XorAtoB {
//    Q: find the xor of all the number from a to b
    static int xor(int x){
        int mask = x%4;
        return switch (mask){
            case 0 -> x;
            case 1 -> 1;
            case 3 -> 0;
            case 2 -> x+1;
            default -> -1;
        };

    }
    static int xorAtoB(int a,int b){
        return xor(b)^xor(a-1);
    }

    public static void main(String[] args) {
        System.out.println(xorAtoB(3,9));
    }
}
