package JAVA_DSA.LeetCode;

public class Q11_ContainerWithMostWater {
    static int maxArea(int[] arr){
        int start = 0;
        int end  = arr.length-1;
        int max = 0;
        while(start<end){
            int hight = Math.min(arr[start],arr[end]);
            int base = end-start;
            int area = hight*base;
            max = Math.max(max,area);
            if(arr[start]>arr[end]){
                end--;
            }
            else{
                start++;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
