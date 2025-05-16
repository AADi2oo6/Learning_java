

public class o5_changeValues {
    static void change(int x){
        x = 00;
    }
    static void changeArr(int[] arr){
        arr[0] = 123123;
    }
    public static void main(String[] args) {
        // if I create a function to change the value of an object the funcion will not be able to change the value as the value will be a local veriable ;
        int x = 123;
        change(x); // this will not change the value of the x ;
        System.out.println(x);

        // but if we try to modefy the value of an object then the modefication will work as both object and the reference veriable of the function will be pointing the the same value if we update the value both will be updated;

        int[] arr = {1,2,3,4,5};// this is the array
        changeArr(arr);// this will modefy the original array;

        System.out.print("Array :  ");
        for (int i :arr){
            System.out.print(i);
            System.out.print(" ,");
        }




    }
    
}
