// Constructors are the special types of function which are invoked when the object of any class is created.
// Constructors can be used to set initial values for object attributes

public class JavaConstructor{
  // int x;
  // public JavaConstructor(){
  //   x = 10;
  // }

  String name;
  int age;
  public JavaConstructor(String s, int a){
    name = s;
    age = a;
  }

  public static void main(String[] args){
    // JavaConstructor obj = new JavaConstructor();
    // System.out.println(obj.x);

    JavaConstructor obj1 = new JavaConstructor("Nisha", 25);
    System.out.println(obj1.name);
    System.out.println(obj1.age);

  }
}