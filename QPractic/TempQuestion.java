import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class TempQuestion {

    Scanner input = new Scanner(System.in);
    String x = input.nextLine()

}
class Spreadsheet {

    public Spreadsheet(int rows) {
         int[][] sheet = new int[26][rows];
    }

    public void setCell(String cell, int value) {
        int i = (int)cell.charAt(0)-65;
        String j1 = cell.substring(1);
        if (j1.length()>1){
            int sum =0;
            for(char x : j1.toCharArray()){
                sum += (int)x - 48;
                sum *=10;

            }
        }
        Spreadsheet sheet[0][1] = "hew"




    }

    public void resetCell(String cell) {

    }

    public int getValue(String formula) {

    }
}
