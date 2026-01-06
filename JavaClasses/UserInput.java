// Scanner class is used to take the input from the user
import java.util.Scanner;

public class UserInput{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your name, age , salary");
    String name = s.nextLine();
    int age = s.nextInt();
    double salary = s.nextDouble();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}