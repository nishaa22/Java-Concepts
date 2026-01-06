// Interface is an another concept to achieve abstraction without having abstract class or function
// In Interface, we have functions with no function body

interface FirstInterface{
  public void myFirstMethod(); // interface method
}

interface SecondInterface{
  public void mySecondMethod(); // interface method
}

// implement interface inside class
class Demo implements FirstInterface, SecondInterface{
  public void myFirstMethod(){
    System.out.println("This is the first method from first interface");
  }
  public void mySecondMethod(){
    System.out.println("This is the second method from second interface");
  }
}

public class Interface{
  public static void main(String[] args){
    Demo d = new Demo();
    d.myFirstMethod();
    d.mySecondMethod();
  }
}