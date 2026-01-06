// polymorphishm: many forms

class Animal{
  public void animalSound(){
    System.out.println("The animal makes a sound");
  }
}

class Cat extends Animal{
  @Override
  public void animalSound(){ // method overriding
    System.out.println("The cat says meow meow");
  }
}

class Dog extends Animal{
  @Override
  public void animalSound(){ // method overriding
    System.out.println("The dog says bow bow");
  }
}

public class Polymorphism{
  public static void main(String[] args){
    Animal a = new Animal();
    Animal c = new Cat();
    Animal d = new Dog();

    a.animalSound();
    c.animalSound();
    d.animalSound();
  }
}