import java.io.*;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class O101_FileWriting {
    public static void main(String[] args) {
        try{
            FileWriter writerObj = new FileWriter("AutoFile.txt");// creatates new file if file not exists
            writerObj.write("Temp file data is this\n");
            writerObj.write("Line 2 Temp file data is this");
            writerObj.close();
            System.out.println("Data inserted in this file ;");
            FileReader readerobj = new FileReader("AutoFile.txt");
            Scanner readfile = new Scanner(readerobj);
            while(readfile.hasNextLine()) System.out.println(readfile.nextLine());
//            for(String s : new String[] {"NewFile.txt","TempFile.txt","TestFile.txt"}){
//                FileReader readerObj = new FileReader(s);
//                Scanner readfile = new Scanner(readerObj);
//                System.out.println(readfile.nextLine());
//                readerObj.close();
//            }


            // how to delete file
//            File obj = new File("TempFile.txt");
//            System.out.println(obj.delete());
//            if(!obj.exists()){
//                System.out.println("File is successfully deleted?? ");
//
//            }
//            else System.out.println("File is not deleted");

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
