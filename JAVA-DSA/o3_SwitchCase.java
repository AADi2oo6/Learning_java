import java.util.Scanner;
public class o3_SwitchCase {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int x = 0;
        while(x ==0 ){

            System.out.print("Enter the Value for input: ");
            String input = data.next();
            
            // lets see the different was to check the values of the input data;
            if (input.equals("Aditya"))  {// if (input == "Aditya"){
                System.out.println("The input contains your Name");
            }
            else{
                System.out.println("INput does not contain your name");
            }
            
            // Now lets use the Switch case statuemets:
            switch (input) {
                case "Aditya" -> {
                    System.out.println("Its My name");
                }
                case "Sharma" -> {
                    System.out.println("Its My surname");
                }
                default -> {
                    System.out.println("Input does not match any case");
                    
                }
            }

            switch (input){
                case "Aryan"-> System.out.println("Russian");
                case "Vedant"-> System.out.println("pooki");
                case "Soham"-> System.out.println("Fatty");
                case "Veda"->System.out.println("Bheem");
            }
            @SuppressWarnings("unused")
            int y = switch (input){
                case "Vedant" -> 123;
                case "Aryan" -> 34;
                default -> 0; // Default case to handle unmatched values
            };
            System.out.print("Enter Data: ");
            int z = data.nextInt();

            // we can give multiple case in one go also;
            switch (z){
                case 1,2,3,4,5->System.out.println("today is weekday");
                case 6,7-> System.out.println("Today is Weekend!");
                default-> System.out.println("Please inter valied number :_________");
            }
            
        //NOTE : We Can also create a Nested Switch Case Statement;
            
        }
        data.close();
    }
}
