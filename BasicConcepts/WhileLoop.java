// while and do-while loop

public class WhileLoop{
  public static void main(String[] args){

    // print numbers from 1 to 10 using while loop
    int i = 1;
    while(i<=10){
      // System.out.println(i);
      i++;
    }

    // countdown to print happy new year
    int countdown = 3;
    while (countdown > 0) {
      // System.out.println(countdown);
      countdown--;
    } 
    // System.out.println("Happy New Year!!");


    // do-while loop
    int x = 1;
    do {
      System.out.println(x);
      x++;
    } while(x<=10);
  }
}