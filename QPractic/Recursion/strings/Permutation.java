package Recursion.strings;

import javax.swing.*;

public class Permutation {
    static void perMute(String Processed, String UnProcessed){
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

    public static void main(String[] args) {
        perMute("","abcd");
    }
}
