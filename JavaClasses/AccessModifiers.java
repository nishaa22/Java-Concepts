// Access Modifiers in java
/**
  1. public - accessible anywhere
  2. private - only accessible inside this class
  3. protected
 */

class Person{
  public String name = "Nisha";
  private int age = 25;
}

public class AccessModifiers{
  public static void main(String[] args){
    Person p = new Person();
    System.out.println(p.name);
    // System.out.println(p.age); // error: saying age has private access in Person
  }
}