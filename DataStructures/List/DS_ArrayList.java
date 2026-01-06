// ArrayList
import java.util.ArrayList;
import java.util.Collections;

public class DS_ArrayList{
  public static void main(String[] args){
    ArrayList<String> fruits = new ArrayList<String>();
    // add array list elements
    fruits.add("Apple");
    fruits.add("Mango");
    fruits.add("Orange");
    fruits.add("Banana");
    fruits.add("Kiwi");
    System.out.println(fruits);

    // add element at specific index
    fruits.add(0,"Strawberry");
    System.out.println(fruits);

    // set/change array list element
    fruits.set(0,"Mulberry");
    System.out.println(fruits);

    // access arraylist specific index element
    System.out.println("Index 1: " + fruits.get(1));

    // get size of arraylist 
    System.out.println("Size: " + fruits.size());

    // remove element from arraylist
    fruits.remove(4);
    System.out.println(fruits);

    // iterate arraylist using for loop
    for(int i=0; i<fruits.size(); i++){
      System.out.println("index "+i+": "+fruits.get(i));
    }

    // iteration using for-each loop
    for(String f : fruits){
      System.out.println(f);
    }

    // Sort arraylist element
    Collections.sort(fruits);
    System.out.println(fruits);

    // remove all elements from an arraylist
    fruits.clear();
    System.out.println(fruits);

  }
}
