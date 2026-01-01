public class ClassAttributes{
  int x = 10;
  String name = "Misha";
  final int y = 20;
  public static void main(String[] args){
    // accessing the attributes of the class
    ClassAttributes obj1 = new ClassAttributes();
    System.out.println(obj1.x);
    System.out.println(obj1.name);
    obj1.name = "Nisha"; 
    System.out.println(obj1.name);

    // second object
    ClassAttributes obj2 = new ClassAttributes();
    // obj2.y = 26; // this will throw an error because y is final 
    System.out.println(obj2.name);


    
  }
}