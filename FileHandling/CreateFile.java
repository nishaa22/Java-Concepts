import java.io.File; // File Class
import java.io.IOException; // IOException for error handling

public class CreateFile{
  public static void main(String[] args){
    try{
      // file class object with filename
      File myfile = new File("firstFile.txt");
      // Method for creating new file
      // returns true if file created, return false if file already exist
      if(myfile.createNewFile()){
        System.out.println("File Created: " + myfile.getName()); // method to get the file name
      }else{
        System.out.println("File already exist");
      }

    }catch(IOException e){
      System.out.println("An error occured...");
      e.printStackTrace(); //print error details
    }
  }
}