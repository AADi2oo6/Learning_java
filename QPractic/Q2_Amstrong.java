import java.util.Scanner;
public class Q2_Amstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt(); 
        boolean resutl = isAmstrong(num);
        System.out.println(resutl);
    }
    static boolean isAmstrong(int x) {
        String str = String.valueOf(x);
        int len  = str.length();
        int sum = 0, num = x ;
        for (int i = 0 ; i<len; i++){
            sum += (int)Math.pow((double)(num % 10), (double)len);
            num /=10;
        }
        return x == sum;

    }
}
