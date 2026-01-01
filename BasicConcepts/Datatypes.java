// Datatypes in java
/*
  1. Primitive
    - byte (-128 to 127)
    - short (-32768 to 32767)
    - int
    - long
    - float (6-7 decimal point)
    - double (15-16 decimal point)
    - boolean
    - char

  2. Non-primitive
    - Strings
    - Arrays
    - Classes

 */

 public class Datatypes{
   public static void main(String[] args){

    //  byte
     byte num = 127;
    //  byte num = 128; //error
    //  System.out.println(num);

    // long number should ends with L
     long myNum = 15000000000L;
    //  System.out.println(myNum);

    //  float
    float f1 = 5.75f;
    // System.out.println(f1);

    // double
    double d1 = 19.99d;
    // System.out.println(d1);

    // e or E means power of 10
    float f2 = 35e3f;
    double d2 = 22E4d;
    // System.out.println(f2);
    // System.out.println(d2);

    // boolean
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    // System.out.println(isJavaFun);   
    // System.out.println(isFishTasty);

    // char - it stores characters or ASCII values in single quotes
    char myGrade = 'B';
    // System.out.println(myGrade);

    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    // System.out.println(myVar1);
    // System.out.println(myVar2);
    // System.out.println(myVar3);

    // String - it is a sequence of characters enclosed in double quotes
    String greeting = "Hello World";
    System.out.println(greeting);


    // Var keyword - this type can be used in place of any primitive types in java, 
    // it automatically detects the type of variable once it is declared, we can not change the type of varible once it is defined,
    //  we always have to assign some value while using var

    // var x; // Error
    // var x = 5;  // OK
    
    var x = 5;  // x is now an int
    x = 10;     // OK - still an int
    // x = 9.99;   // Error - can't assign a double to an int

   }
 }