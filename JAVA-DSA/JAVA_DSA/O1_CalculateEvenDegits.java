package JAVA_DSA;
// Q: In an array of elements calculate number of elements having even number of digits.

public class O1_CalculateEvenDegits {
    static int EvenDegits(int[] x ){
        int result=0;
        for(int i : x ){
            int l = String.valueOf(i).length();
            if (l%2 ==0){
                result+=1;

            }
       }
        System.out.println("the Number of even eleemmts : " + result);
        return result;
    }
    public static void main(String[] args) {
        // let take ana array :
        int[] arr = {1234,34,5,2,444,123435,234};
        EvenDegits(arr);
    }
}
