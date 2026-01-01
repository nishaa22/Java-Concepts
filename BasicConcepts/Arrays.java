// arrays in java

public class Arrays{
  public static void main(String[] args){

    // defining array
    String[] fruits = {"Apple", "Banana", "Orange", "Kiwi"};

    // accessing array elements
    // System.out.println(fruits[0]);
    // System.out.println(fruits[1]);
    // System.out.println(fruits[2]);
    // System.out.println(fruits[3]);
    // System.out.println(fruits[4]); // error: index 4 out of bound

    // changing array element
    fruits[0] = "Strawberry";
    // System.out.println(fruits[0]);

    // for each loop through an array
    for(String f : fruits){
      // System.out.println(f);
    }

    // length of an array
    // System.out.println(fruits.length);

    // creating array using new keyword
    String[] cars = new String[4]; // size 4
    cars[0] = "Ford";
    cars[1] = "BMW";
    cars[2] = "Volvo";
    cars[3] = "Ferrari";
    for(String c : cars){
      // System.out.println(c);
    }

    // accessing array elements using for loop
    for(int i=0; i<cars.length; i++){
      // System.out.println(cars[i]);
    }


    // Multi-dimensional array
    int[][] numbers = {{1,2,3},{4,5,6,9}};
    // row 1 : 1,2,3
    // row 2 : 4,5,6
    for(int row=0; row<numbers.length; row++){
      for(int col=0; col<numbers[row].length; col++){
        // System.out.println("Number["+row+"]["+col+"]: "+numbers[row][col]);
      }
    }



    // two dimensional array into single
    int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

    for (int[] row : myNumbers) {
      for (int num : row) {
        System.out.println(num);
      }
    }
  }
}