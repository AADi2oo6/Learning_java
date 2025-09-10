import java.util.ArrayList;
import java.util.List;

public class O29_Permutation {
    // we have to return all the possible combinations
    // no. of permutations - n!;
    // we will be doing this with the same way as we did for the subsets

    static void perMute1(String Processed, String UnProcessed){
        if(UnProcessed.isEmpty()){
            System.out.println(Processed);
            return;
        }
        char ch = UnProcessed.charAt(0);
        UnProcessed = UnProcessed.substring(1);
        for (int i = 0 ;i <= Processed.length();i++){
            String NewProcessed = Processed.substring(0,i)+ch+ Processed.substring(i);
            perMute(NewProcessed,UnProcessed);
        }
    }

    static ArrayList<String> perMute(String Processed,String UnProcessed){
        if(UnProcessed.isEmpty()){
            ArrayList<String> arr = new ArrayList<>(1);
            arr.add(Processed);
            return arr;
        }
        char ch = UnProcessed.charAt(0);
        UnProcessed = UnProcessed.substring(1);
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0 ; i <Processed.length()+1;i++){
            String NewProcessed = Processed.substring(0,i)+ch+ Processed.substring(i);
            result.addAll(perMute(NewProcessed,UnProcessed));
        }
//        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(perMute("","abcd"));    }
}
