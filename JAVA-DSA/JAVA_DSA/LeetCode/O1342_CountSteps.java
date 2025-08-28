package JAVA_DSA.LeetCode;
//1342. Number of Steps to Reduce a Number to Zero
public class O1342_CountSteps {
    public int counter =0;
    public int numberOfSteps(int num) {
        if (num ==0){
            return counter;
        }
        if (num%2 ==0){
            numberOfSteps(num/2);
        }
        else{
            numberOfSteps(num-1);
        }
        return counter;
    }

}
