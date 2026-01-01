// Data type Casting in java
/*
  1. Widening Casting (Automatic) - converting smaller to larger type
   byte -> short -> char -> int -> long -> float -> double

  2. Narrowing Casting (Manual) - converting larger to smaller type
    double -> float -> long -> int -> char -> short -> byte

 */

public class TypeCasting{
  public static void main(String[] args){

    // Widening Casting
    int myInt = 10;
    double myDouble = myInt;
    // System.out.println(myInt);
    // System.out.println(myDouble);

    // Narrowing Casting
    float f1 = 9.5f;
    int num = (int)f1; //manual casting - float to int
    // System.out.println(f1);
    // System.out.println(num);

    // System.out.println((double)500/423);
    // System.out.println(500.0/423);
  }
}