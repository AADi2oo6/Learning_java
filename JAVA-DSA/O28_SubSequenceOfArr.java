import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O28_SubSequenceOfArr {
    // you have an array of n elements and you have to find
    // a new array with all the subsets of the  array ;
    static void subsetsUsingRecursion(int[] pArray,int[] upArray){
        if(upArray.length==0){
            System.out.println(Arrays.toString(pArray));
            return;
        }
        subsetsUsingRecursion(pArray,Arrays.copyOfRange(upArray,1,upArray.length));
        int[] arr = new int[pArray.length+1];
        for(int i=0 ;i<pArray.length;i++){
            arr[i] = pArray[i];
        }
        arr[pArray.length] = upArray[0];
        subsetsUsingRecursion(arr,Arrays.copyOfRange(upArray,1,upArray.length));
    }

    static List<List<Integer>> subsetOfDuplicate(int[] arr) {
        Arrays.sort(arr); // sort to handle duplicates
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // start with empty subset

        int start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;

            // if current element is same as previous, only use subsets created in previous step
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;

            int size = outer.size();
            for (int j = start; j < size; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] arr1 ={1,2,2};
        int[] arr = {};
//        subsetsUsingRecursion(arr,arr1);

    }
}
