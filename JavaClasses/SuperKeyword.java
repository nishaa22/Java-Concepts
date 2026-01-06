// super refers to the parent class of the subclass
// super statement should be the first statement

class Animal{
  // Animal class Constructor
  Animal(){
    System.out.println("Animal Constructor is called");
  }

  // Animal class Variable
  public String name = "Any Animal";

  // Animal class Method
  public void makesSound(){
    System.out.println("They make some sound");
  }
}

class Cat extends Animal{
  public String name = "Cat";

  Cat(){
    super(); // Animal constructor is called
    System.out.println("Cat Constructor is called");
  }

  @Override
  public void makesSound(){
    super.makesSound(); // calling super class method
    System.out.println("They sounds meow meow");
  }

  public void printName(){
    System.out.println(super.name); // variable of parent class called
  }
}

public class SuperKeyword{
  public static void main(String[] args){
    Cat c = new Cat();
    c.makesSound();
    c.printName();
  }
}