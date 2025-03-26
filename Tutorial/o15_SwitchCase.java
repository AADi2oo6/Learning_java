class o15_SwitchCase{
    public static void main(String args[])
    {
        // using the switch case ladder in the java
        int n = 2;
        //NOTE: Once the case is matched the remaning case will autometically be run wwithout matching so use "break"
        switch(n) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            default -> System.out.println("Enter the number in range[1,4]");
            }

        // if you don't want to use the break statement in evey line use the new syntax:
        int x = 1;
        switch(x){//if using arrow use arrow in all the cases;
            case 1 -> System.out.println("Janaury");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
        }

        String m;
        switch(x){
            case 1 -> m = "January";
            case 2 -> m = "February";
            case 3 -> m = "March";
            default -> m = "None";
        }
        System.out.println(m);

        // A very new Method to use the switch
        // String result = "";
        String result = switch(n){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "WEdnesday";
            case 4 -> "Thrusday";
            default -> "none";
        };//Note : hear we have to use the semicolon as it is a statement hear no the block
        System.out.println(result);
    }

}