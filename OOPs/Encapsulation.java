// Encapsulation means hiding sensitive data from the user.
// so we keep the variables private and provide get set method to access that variable

class Person{
  private String name;

  // getter
  public String getName(){
    return name;
  }

  // setter
  public void setName(String name){
    this.name = name;
  }
}

public class Encapsulation{
  public static void main(String[] args){
    Person p = new Person();
    // p.name = "Nisha"; // error
    // System.out.println(p.name); // error

    p.setName("Nisha");
    System.out.println(p.getName());
  }
}