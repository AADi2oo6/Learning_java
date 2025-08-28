package Recursion;

public class ReverseNumber {
    static int sum =0;
    static int reverse(int x ){
        if (x <=0){
            return sum;
        }
        int r = x%10;
        sum =sum*10+r;
        return reverse(x/10);

//        int temp = 0;
//        while(x>0){
//            temp*=10;
//            temp+=x%10;
//            x/= 10;
//
//        }
//        return temp;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(sum);
    }
}
