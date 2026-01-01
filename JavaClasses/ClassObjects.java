public class ClassObjects{
  int x = 5;
  public static void main(String[] args){
    ClassObjects obj1 = new ClassObjects();
    ClassObjects obj2 = new ClassObjects();
    System.out.println(obj1.x);
    System.out.println(obj2.x);

    // creating the object of another file here and accessing the variables of that file here
    Main m = new Main();
    System.out.println(m.greet);
  }
}