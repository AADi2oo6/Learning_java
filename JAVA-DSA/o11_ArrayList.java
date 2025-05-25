import java.util.ArrayList;
import java.util.Scanner;

public class o11_ArrayList {
    // In this we will be learning about what is the array list and why do we need it
    public static void main(String[] args){
//        In Array list We don't need to specify the size of the Array;
//        syntax : ArrayList<integer> list = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>(10);

        //adding values in ArrayList
        int x = 0;
        Scanner num = new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.print("Enter the value of "+(i+1)+"th element : ");
            x = num.nextInt();
            list.add(x);// .add() is use to add element in the ArrayList
        }
        // we can directly print the arraylist
        System.out.println(list);

        // we can check if an element is present in the list with the help of .contains()
        System.out.println(list.contains(1234));// return true if 1234 present in list

        // .get(i) can be use to print the element at the index i of the array
        System.out.println("Element at index 2 is : "+list.get(2));


    }
}
