// Method Overloading means having two functions of the same name

public class MethodOverloading{
  // static int plusInt(int x, int y){
  //   return x + y;
  // }
  // static double plusDouble(double x, double y){
  //   return x + y;
  // }

  // we can overload plusInt and plusDouble method
  static int plus(int x, int y){
    return x + y;
  }
  static double plus(double x, double y){
    return x + y;
  }
  public static void main(String[] args){
    // System.out.println(plusInt(2,4));
    // System.out.println(plusDouble(2.5,4.5));

    System.out.println(plus(2,4));
    System.out.println(plus(2.5,4.5));
  }
}