// Enum is a special class which represents a group of constants (unchangable variables like final)
// For creating an enum, we use the keyword enum 

enum Levels{
  LOW,
  MEDIUM, 
  HIGH
}

public class EnumClass{
  public static void main(String[] args){
    Levels l = Levels.MEDIUM;

    switch(l){
      case LOW:
        System.out.println("Low Level");
        break;
      case MEDIUM:
        System.out.println("Medium Level");
        break;
      case HIGH:
        System.out.println("High Level");
        break;
    }
  }
}