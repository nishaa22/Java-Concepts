// final, static, and abstract

public class NonAccessModifiers{
  // final 
  final int age = 20;
  final String name = "Nisha";
  final double d = 29.44;


  // static
  static void myStaticMethod(){
    System.out.println("Static Methods can be called without creating objects");
  }

  public static void main(String[] args){
    NonAccessModifiers n = new NonAccessModifiers();
    // n.age = 35; // error: because we are trying to change final class variables
    System.out.println(n.age);

    // calling static method
    myStaticMethod();

  }
}

