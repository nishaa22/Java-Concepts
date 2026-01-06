// Abstraction means hiding some sensitive data from the user
// abstract method can only be declared in abstract class and those method dont have method definiton 
// abstract method defintion is given in subclass
// abstract class can have normal method

abstract class Animal{
  public abstract void makesSound();
  public void sleep(){
    System.out.println("zzz...");
  }
}

class Cat extends Animal{
  @Override
  public void makesSound(){
    System.out.println("Meow meow");
  }
}

public class Abstraction{
  public static void main(String[] args){
    Cat c = new Cat();
    c.sleep();
    c.makesSound();
  }
}