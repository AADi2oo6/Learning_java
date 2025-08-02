public class Q5_StringPalindrom {
    static boolean checkPalindrom(String x){
        int start = 0;
        int end = x.length()-1;
        while(end >= start ){
            if (x.charAt(start)!=x.charAt(end) ){
                return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(checkPalindrom("1221"));
    }
}
