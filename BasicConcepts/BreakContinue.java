// break continue

public class BreakContinue{
  public static void main(String[] args){

    // break
    for(int i=1; i<=10; i++){
      if(i==5)
        break;
      // System.out.println(i);
    }

    // continue
    for(int i=1; i<=10; i++){
      if(i==4)
        continue;
      // System.out.println(i);
    }


    // break in while loop
    int i = 0;
    while (i < 10) {
      if (i == 4) {
        break;
      }
      // System.out.println(i);
      i++;
    }


    // continue in while loop
    int k = 0;
    while (k < 10) {
      if (k == 4) {
        k++;
        continue;
      }
      // System.out.println(k);
      k++;
    }


    // break and continue together
    int[] numbers = {3, -1, 7, 0, 9};

    for (int n : numbers) {
      if (n < 0) {
        continue; // skip negative numbers
      }
      if (n == 0) {
        break; // stop loop when zero is found
      }
      System.out.println(n);
    }

  }
}