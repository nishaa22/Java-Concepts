// Recursion

public class Recursion{
  static int factorial(int n){
    if(n==0 || n==1){
      return 1;
    }
    int fact = 1;
    fact = n * factorial(n-1);
    return fact;
  }
  public static void main(String[] args){
    int result = factorial(5);
    System.out.println(result);
  }
}