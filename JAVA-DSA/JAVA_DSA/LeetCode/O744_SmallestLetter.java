package JAVA_DSA.LeetCode;
/*
744. Find Smallest Letter Greater Than Target
    You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
    There are at least two different characters in letters.

    Return the smallest character in letters that is lexicographically greater than target.
    If such a character does not exist, return the first character in letters.
 */
public class O744_SmallestLetter {
    static public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while (start<=end){
            System.out.printf("(%d,%d)%n",start,end);
            int middle = start+(end-start)/2;
            /*
            // THIS IS WRONG
            if (target>letters[middle]){
                start = middle +1;
            }else {
                end = middle -1;
            }
             */
            if (target < letters[middle]) {
                end=middle-1;
            } else {
                start = middle + 1;
            }

            //Note : when (found or not found ) then return 0 the index
        }
        // if not found : start = end+1 which is equal to length
        // if found : return start(which will be middle +1(next position to the answer))
        return letters[start % letters.length];
        // the above line will return 0,1,2,....<letters.lenght which is equal to the start only
        // but if not found (we know when not found start = lenght) will return 0;

//        if ((start > letters.length-1)){
//            return letters[0];
//        }else {
//            return letters[start];
//        }
    }
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'c'));
    }
}
