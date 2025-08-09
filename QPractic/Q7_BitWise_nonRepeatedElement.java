public class Q7_BitWise_nonRepeatedElement {
//    Find the element in an array which is not repeated
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3,4,5};
        int result=0;
        for(int i:arr){
            result^=i;
        }
        System.out.println("Not repeated: "+result);

    }
}
