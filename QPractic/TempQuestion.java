public class TempQuestion {

    public static void main(String[] args) {

        // a. divid by zero
        System.out.println("--- 1. devide by 0 test ---");
        try {
            int numbr = 10;
            int anothrNum = 0;
            int anser = numbr / anothrNum;
            System.out.println("anser is: " + anser);
        } catch (Exception excep) {
            System.out.println("oops error. cant devide by 0.");
        }

        // b. Array index out of bonds
        System.out.println("\n--- 2. aray test ---");
        try {
            int[] myAray = new int[3];
            myAray[0] = 1;
            myAray[1] = 2;
            myAray[2] = 3;

            System.out.println("geting numbr from aray...");
            int myNumbr = myAray[99]; // this shud crash

        } catch (Exception excep) {
            System.out.println("whoa ther's nothin in that spot in the aray.");
        }

        // c. Nul pointer
        System.out.println("\n--- 3. nul pointer test ---");
        try {
            String myStrng = null;
            System.out.println("geting lenth of string...");
            System.out.println(myStrng.length());

        } catch (Exception excep) {
            System.out.println("errr. the string is empty (nul).");
        }

        System.out.println("\nprogam is done.");
    }
}