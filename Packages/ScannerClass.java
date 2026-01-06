import java.util.Scanner;
// Scanner is an inbuilt class which is used to take input from the user
// it comes under java.util.Scanner

public class ScannerClass{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your name: ");

    String name = s.nextLine();
    System.out.println("Username is :" + name);

    s.close();
  }
}
