import java.io.File;

public class DeleteFile{
  public static void main(String[] args){
    File f = new File("firstFile.txt");
    if(f.exists()){
      f.delete();
      System.out.println("Successfully deleted: " + f.getName());
    } else{
      System.out.println("File does not exist");
    }
  }
}