public class Q13_NoOfDigitsInBaseB {
//    Q: a Number will be given in base b and you have to return the number of digits present in that number
    static int NoOfDigits(int num, int base){
        return (int)(Math.log(num) / Math.log(base))+1;
        // logb(n) = log(n)/log(b)
    }

    public static void main(String[] args) {
        System.out.println(NoOfDigits(6,2));
    }
}
