package JAVA_DSA;

public class O1_Questions {
    // Q1 : Search in String ->
    static int StringSearch(String s, char t){
        for ( int i = 0 ; i < s.length(); i ++){
            if (t == s.charAt(i)){
                System.out.println("Value found at index " + i);
            }
        }
        //OR
        for(char i : s.toCharArray()){
            if(s.length() ==0 ){
                return -1;
            } else if (i == t) {
                return s.indexOf(i);
            }
        }
        return 0;
    }
    static void SearchIn2D(int[][] x , int t){
        for(int[] i: x ){
            for (int j : i){
                if ( j == t){
                    System.out.println("Value found ");
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println(StringSearch("Aditya",'t'));

        int [][] Array2D = {
                {1,2,3,4},
                {5,6,7},
                {8,9,0}
        };
        SearchIn2D(Array2D,9);
    }
}
