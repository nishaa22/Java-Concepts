// for loop, nested for loop, for each loop

public class ForLoop{
  public static void main(String[] args){
    // for loop
    for (int i = 0; i <= 10; i = i + 2) {
      // System.out.println(i);
    }

    // sum using for loop
    int sum = 0;
    for(int i=1; i<=5; i++){
      sum+=i;
    }
    // System.out.println("Sum is " + sum);


    // countdown using for loop
    int countdown = 5;
    for(int i=countdown; i>=1; i--){
      // System.out.println(i);
    }



    // Nested for loop
    for(int i=1; i<=2; i++){
      // System.out.println("Outer loop: "+i);
      for(int j=1; j<=3; j++){
        // System.out.println("Inner loop: "+j);
      }
    }



    // for each loop
    int[] numbers = {10, 20, 30, 40};
    for (int num : numbers) {
      System.out.println(num);
    }

    // print fruits using for each loop
    String[] fruits = {"Apple", "Mango", "Banana", "Orange", "Grapes"};
    for(String fruit : fruits){
      System.out.println(fruit);
    }
  }
}