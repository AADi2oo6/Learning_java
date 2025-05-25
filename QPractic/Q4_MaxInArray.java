public class Q4_MaxInArray {
    public static void main(String[] args){
        int[] arr = {1,4,2,7,8,4,5};
        System.out.println("The max of the array : "+max(arr));

    }
    static int max(int[] arr){
        int max = 0;
        for (int i : arr){
            if (i>max){
                max = i;
            }
        }
        return max;
    }
}
