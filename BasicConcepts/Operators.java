// Operators in java

public class Operators{
  public static void main(String[] args){
    // Arithmetic Opertors: +, -, *, /, %, ++, --
    int x = 10;
    int y = 3;

    // System.out.println(x + y); // 13
    // System.out.println(x - y); // 7
    // System.out.println(x * y); // 30
    // System.out.println(x / y); // 3
    // System.out.println(x % y); // 1

    int z = 5;
    ++z;
    // System.out.println(z); // 6
    --z;
    // System.out.println(z); // 5



    // Assignment Operators: =, +=, -=, *=, /=, %=, ^=, &=, >>=, <<=
    int savings = 100; 
    savings += 50; // add 50 to savings
    // System.out.println("Total savings: " + savings);


    // Comparison Operators: ==, !=, <, >, <=, >=
    int passwordLength = 5;
    // System.out.println(passwordLength >= 8); 
    // System.out.println(passwordLength < 8);


    // Logical Operators: &&, ||, !
    boolean isLoggedIn = true;
    boolean isAdmin = false;
    // System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
    // System.out.println("Has access: " + (isLoggedIn || isAdmin));
    // System.out.println("Not logged in: " + (!isLoggedIn));


    // Precedence
    /*

    () - Parentheses
    *, /, % - Multiplication, Division, Modulus
    +, - - Addition, Subtraction
    >, <, >=, <= - Comparison
    ==, != - Equality
    && - Logical AND
    || - Logical OR
    = - Assignment
    
     */

    int result1 = 10 - 2 + 5;    // (10 - 2) + 5 = 13
    int result2 = 10 - (2 + 5);  // 10 - 7 = 3
    System.out.println(result1);
    System.out.println(result2);
  }
}