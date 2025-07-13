
import java.util.Arrays;

//varargs = Veriable Argumenst of functions means tha when we don't know how many argumnst we have to pass in the function we use varargumenst
//Note: veriable length argumesnt are always at the end
public class o8_VariableArgs {
    public static void main(String[] args) {
        getArr(1,2,3,4,5);
        int x = get(1,2,"Aditya","Avinash","Rohan");
        System.out.println(x);
    }
    //syntax : "dataType ...objName"
    static void getArr(int ...i){ // will return a array of int
        System.out.println(Arrays.toString(i));
        int x1 = i.length;
        System.out.println("The length of the array is : "+x1);
        for (int x: i){
            System.out.println(x);
        }
    }

    static int get(int a, int b, String ...str){
        System.out.println(Arrays.toString(str));
        return a+b;
    }
}
