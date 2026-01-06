// abstract method can only be declared in abstract class and its body is defined in subclass

abstract class Main{
  public String name = "Nisha";
  public int age = 20;
  public abstract void study();
}

class Student extends Main{
  public int gradYear = 2018;
  public void study(){
    System.out.println("Studying all day long..");
  }
}

public class AbstractClass{
  public static void main(String[] args){
    Student s = new Student();
    System.out.println("Name: " + s.name);
    System.out.println("Age: " + s.age);
    System.out.println("Grad Year: " + s.gradYear);
    s.study();
  }
}