import java.util.Arrays;

public class O20_StringBuilder {
    public static void main(String[] args){
//        String series ="";
//        for (int i =0 ; i <26;i++){
//            char alphabet= (char)('a'+i);
//            series+=(char)('a'+i);
//            System.out.println(alphabet);
//        }
//        System.out.println(series);
//      NOTE: the above code is executing n^2 times n time in loop and each time the loop execute it creates a new object called series

//        where as in string builder it basically just updates the previous data

        StringBuilder series = new StringBuilder();
        for(int i =0; i<26;i++){
            series.append((char)('a'+i));
        }
        System.out.println(series);
        System.out.println(series.toString());


    }
}
