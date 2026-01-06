import java.util.LinkedList;
import java.util.Collections;

public class DS_LinkedList{
  public static void main(String[] args){
    LinkedList<Integer> numbers = new LinkedList<Integer>();
    numbers.add(3);
    numbers.add(1);
    numbers.add(90);
    numbers.add(45);
    System.out.println(numbers);

    // add first
    numbers.addFirst(78);
    System.out.println(numbers);

    // add last
    numbers.addLast(100);
    System.out.println(numbers);

    // get first
    System.out.println("First: " + numbers.getFirst());

    // get last
    System.out.println("Last: " + numbers.getLast());

    // remove first
    numbers.removeFirst();
    System.out.println(numbers);

    // remove last
    numbers.removeLast();
    System.out.println(numbers);

    // add/replace/change at specifix index
    numbers.set(3,900);
    System.out.println(numbers);

    // size
    System.out.println("Size: " + numbers.size());

    // for-each loop
    for(Integer n : numbers){
      System.out.println(n);
    }

    // sort
    Collections.sort(numbers);
    System.out.println(numbers);

    // reverse sort
    Collections.sort(numbers, Collections.reverseOrder());
    System.out.println(numbers);

    // clear
    numbers.clear();
    System.out.println(numbers);


  }
}