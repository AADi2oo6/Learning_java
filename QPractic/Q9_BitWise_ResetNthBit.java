public class Q9_BitWise_ResetNthBit {
//    Q: given a number reset it's nth bit to 1;
public static void main(String[] args) {
//    how it works: eg 1111011 || 0000100 = 1111111;
    int num = 123;
    int i = 3;
    int mask = 1<<(i-1);
    System.out.println(num | mask);
}
}
