// Anonymous class is a class without a name which is used to override the function definition of a class or interface

interface Greetings{
  void sayHello();
}

class Respect{
  public void sayNamastey(){
    System.out.println("This method is used to greet.");
  }
}

public class Anonymous{
  public static void main(String[] args){

    // anonymous class to write the function definition of Greetings interface
    Greetings g = new Greetings(){
      public void sayHello(){
        System.out.println("Say Hellooo......");
      }
    };
    g.sayHello();

    // overriding the function definition of a class using anonymous class
    Respect r = new Respect(){
      @Override
      public void sayNamastey(){
        System.out.println("Say Namastey...");
      }
    };
    r.sayNamastey();

    // function call without overriding 
    Respect r1 = new Respect();
    r1.sayNamastey();

  }
}

