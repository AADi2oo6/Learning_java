public class Q11_FindUniqueInOddRepeatedArray
{
//    Q: given an array of number with eachh number reapeated 3thirce find the unique number;
    static int findUnique(int[] arr){
        int result = 0;

        for (int i =0;i<8;i++){ // considering each element of the arrays as a 8 bit number [-128 to 127]
            int bitSum= 0;
            int mask = 1<<i; // this is number which will be in form 1,10, 100, 1000,.... changes with respect to i

            for (int j: arr){// j is element of array
                if((j & mask) !=0){ // if j & mask !=0 means there is 1 at index i
                    bitSum++; // as we encounter 1 increase bitsum value by 1
                }
            }// after the loop ends bit sum will be multiple of 3 or not
            if(bitSum%3!=0){ // if multiple of 3 means bit belongs to 3 time repeated numbber else not
                result = result | mask;// if not add the number to result
            }
        }
        return result; // atlast return the reslut;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 3, 6, 6, 1, 1};
        System.out.println(findUnique(arr));
    }
}
