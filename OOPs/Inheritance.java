// If the class is final, then we cannot extend this class
// final class Student

class Student{
  protected String name = "Nisha";
  public int age = 20;
  public void getInfo(){
    System.out.println("Name is "+name+". Age is "+age);
  }
}

public class Inheritance extends Student{
  public int gradYear = 2020;
  public static void main(String[] args){
    Inheritance s = new Inheritance();
    s.getInfo();
    System.out.println(s.name + " " + s.age + " " + s.gradYear);
  }
}