public class ClassMethod{
  static void greet(){
    System.out.println("Good Morning");
  }
  public void greetings(){
    System.out.println("Good Evening");
  }
  static int sum(int x, int y){
    return x + y;
  }
  public static void main(String[] args){
    // invoking function directly
    greet();
    System.out.println(sum(2,3));
    // greetings(); // this will throw an error, public methods can only be accessed using the object.

    // creating object 
    ClassMethod obj1 = new ClassMethod();
    // invoking method using object
    obj1.greet();
    obj1.greetings();
    System.out.println(obj1.sum(12,3));


    // Creating object of another file Main
    Main m1 = new Main();
    m1.mainMethod();
  }
}