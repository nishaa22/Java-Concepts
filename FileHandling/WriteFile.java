import java.io.FileWriter;
import java.io.IOException;

public class WriteFile{
  public static void main(String[] args){
    try{
      // class object for writing into the file
      FileWriter f = new FileWriter("firstFile.txt");
      f.write("I am writing content to the file using the FileWriter class.");
      f.close();
      System.out.println("Successfully wrote to the file");

      // class object for appending, give true for appending
      FileWriter f1 = new FileWriter("firstFile.txt", true);
      f1.write("\nThis is the appended text.");
      f1.close();
      System.out.println("Successfully Appended");
    }catch(IOException e){
      System.out.println("An error occured");
      e.printStackTrace();
    }
  }
}