package Recursion;

public class CountZeros {
    //Method 1 : by taking zero count as an argument
    static int zerosCount(int x,int count ){
        int C =count;
        if (x<=0){
            return count;
        }
        else if ( x%10 == 0){
            C++;
            return zerosCount(x/10,C);
        }

        return zerosCount(x/10,C);

    }

    public static void main(String[] args) {
        System.out.println(zerosCount(12030,0));
    }
}
