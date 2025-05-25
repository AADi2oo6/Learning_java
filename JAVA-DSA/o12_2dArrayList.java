import java.util.ArrayList;
import java.util.Scanner;

public class o12_2dArrayList {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        // 2d-ArrayList is an ArrayList of ArrayList
        ArrayList<ArrayList<Integer>> List2d = new ArrayList<>();
        // lest INITIALIZE the 2d ArrayList with ArrayList
        for(int i =0; i<3;i++){
            List2d.add(new ArrayList<>());
            // the list has 3 ArrayList
        }


        // Add elements in a 2d ArrayList
        for(int i =0 ; i<3;i++){
            for (int j = 0 ; j <3; j++){
                List2d.get(i).add(input.nextInt());
            }
        }
        for (ArrayList<Integer>  x : List2d){
            System.out.println(x);
        }
//        System.out.println(List2d);
    }
}
