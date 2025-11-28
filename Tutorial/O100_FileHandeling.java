import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class O100_FileHandeling {
    public static void main(String[] args) {
//        try {
//            FileWriter myWriter = new FileWriter("TestFile.txt");
//            myWriter.write("Hellow this is the content of the file which i have just created");
//            myWriter.close();
//            System.out.println("Data Inserted Successufully!");
//        } catch (IOException e) {
//            System.out.println(e);
//        }
        try{
            File fileObj = new File("NewFile.txt");// Specifing the file name
            if(fileObj.createNewFile()) System.out.println("File Created : "+fileObj.getName());
            else System.out.println("File Already Exists !!");
            System.out.printf("is file readable : {%s} is file writable : {%s} ",fileObj.canRead(),fileObj.canWrite());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
