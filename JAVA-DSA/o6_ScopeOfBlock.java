@SuppressWarnings("unused")
public class o6_ScopeOfBlock {
    public static void main(String[] args) {
        // we can create a block in java with the help of {}
        int x = 123;
        String str = "Aditya";
        
        // if i create a block and try to change the value of x or str it will change it
        {
            x = 534;
            str = "Sharma";// in a block we can access the global veriables
        
            int y = 234;// but the veriables defined inside the block can't be used outside
        }
        // System.out.println(y); this will give an error
    }
}
