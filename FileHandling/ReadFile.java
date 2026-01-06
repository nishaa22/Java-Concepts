import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile{
  public static void main(String[] args){
    try{
      File f = new File("firstFile.txt");
      Scanner reader = new Scanner(f);
      while(reader.hasNextLine()){
        String data = reader.nextLine();
        System.out.println(data);
      }
    }catch(FileNotFoundException e){
      System.out.println("An error occurred");
      e.printStackTrace();
    }
  }
}