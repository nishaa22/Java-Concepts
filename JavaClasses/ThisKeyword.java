// this keyword refers to the current object in a method or constructor

public class ThisKeyword{
  String name;
  int age;

  // calling another constructor inside constructor and setting the default value for age
  public ThisKeyword(String s){
    this(s, 25); //another constructor
  }

  // constructor with two parameters 
  public ThisKeyword(String n, int a){
    this.name = n;
    this.age = a; // refers to the class variables age
  }

  public void printInfo(){
    System.out.println("Name is " + name);
    System.out.println("Age is " + age);
  }
  
  public static void main(String[] args){
    ThisKeyword k1 = new ThisKeyword("Nisha");
    k1.printInfo();

    ThisKeyword k2 = new ThisKeyword("Katrina", 35);
    k2.printInfo();
  }
}