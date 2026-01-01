public class JavaMethod{
  static void greetings(){
    System.out.println("Good Morning");
  }
  // method with parameter
  static void printNames(String name){
    System.out.println("My name is: "+name);
  }

  // method with multiple parameters
  static void getInfo(String name, int age){
    System.out.println("My name is "+name+". My age is "+age+".");
  }

  // method with return value
  static int sum(int x, int y){
    return x+y;
  }

  public static void main(String[] args){
    greetings();

    // function call with arguement
    printNames("Nisha");
    printNames("Nishu");

    // function call with multiple arguements
    getInfo("Nisha", 25);

    // invoking of return value function
    System.out.println("Sum is: " +sum(10,5));
  }
}