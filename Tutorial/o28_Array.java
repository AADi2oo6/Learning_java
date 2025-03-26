public class o28_Array {
    public static void main(String args[]){
        //creating an array ;
        int arr[]= {1,2,3,4};
        int arr1[] = new int[5];//this is the way to create an empty array which can stor only 5 values
        //NOTE : in above by default all the value of the array will be zero; until it is assinged

        arr[0] = 100;//this is how you can change the value of the array
        System.out.println(arr[0]);

        for (int i=0;i<5;i++){
            arr1[i] = 3*i + 4;
            System.out.println(arr1[i]);
        }
        // how to use "for i in arr" in java;
        for (int i : arr){
            System.out.println(i);
        }
}
}