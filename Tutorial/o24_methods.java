class computer{//we can create any class according to our use
    // syntax for method 
    //public <return type(void if no return)> <method_name>(type ver1,var2){ <<<content>>>}
    public void music(){
        System.out.println("Music is playing ........");

    }
    public int getMePen(int cost){
        if (cost%10 ==0) {
            System.out.println(String.format("Congrats you got the pen for Rs%d Thank you ! ",cost));
            return cost; 
        }
        else{
            System.out.println(String.format("The given price(%d) does not match with the price of avelable pens. ", cost));
            return cost;
        }
    }

}
public class o24_methods {
    public static void main(String args[])
    {
        computer Acer = new computer();
        Acer.music();
        int price = Acer.getMePen(62);
        System.out.println(price);

    }
    
}
