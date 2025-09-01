import java.sql.Array;

public class TempQuestion {
    public static void main(String[] args) {
        char ch = 'a';
        String x  = "";
        int n = 5;
        for (int i =0 ; i <n ;i++){
            for (int j = 0 ; j < i ; j++){

                System.out.print((char)(ch+1));
            }
            System.out.println();
        }
    }
}

