public class Q10_posOfRightMostSetBit {
//    Q : find the positon of right most set bit(1)
//    eg: 1001000 = 4;
public static void main(String[] args) {
    int x = 60;
    int i=1;
    while (true){
        if((x&1)==0){
            i++;
            x = x>>1;
        }
        else{
            System.out.println(i);
            break;
        }
    }
}
}
