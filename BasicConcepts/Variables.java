// Variables in java - int, float, char, String, boolean


public class Variables{
  public static void main(String[] args){

    // int 
    int number = 10;
    number = 90; //this will overwrite the previous variable number
    // System.out.println(number);

    // final int 
    final int age = 20;
    // age = 25; // this will throw an error because final donot allow to overwrite age variable
    // System.out.println(age);

    // String - strings are declared in double quotes
    String s = "Learning Java";
    // System.out.println(s);
    // System.out.println("I am " + s);

    // float - while giving floating point we need to add f at last of the number otherwise it will throw an error
    float f = 5.25f;
    // System.out.println(f);

    // char - characters are defined in single quotes
    char n = 'N';
    // System.out.println(n);

    // boolean - it is used for true or false
    boolean isSingle = true;
    // System.out.println(isSingle);


    // concatenation
    int x = 2;
    int y = 3;
    // System.out.println("The sum is : " + x + y);
    // System.out.println("The sum is : " + (x+y));


    // declaring multiple variables of the same type
    int a,b,c;
    a=10; b=20; c=30;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}