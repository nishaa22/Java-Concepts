public class IfElse{
  public static void main(String[] args){
    // if condition 
    if(5>2){
      // System.out.println("5 is greater than 2");
    }

    // if-else
    boolean isRaining = false;
    if (isRaining) {
      // System.out.println("Bring an umbrella!");
    } else {
      // System.out.println("No rain today, no need for an umbrella!");
    }


    // if-else-if 
    int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy
    if (weather == 1) {
      // System.out.println("Bring an umbrella.");
    } else if (weather == 2) {
      // System.out.println("Wear sunglasses.");
    } else {
      // System.out.println("Just go outside normally.");
    }


    // short hand if-else : ternary operator
    int time = 22;
    String message = (time < 12) ? "Good morning."
                  : (time < 18) ? "Good afternoon."
                  : "Good evening.";
    // System.out.println(message);


    // nested if-else
    int age = 20;
    boolean isCitizen = true;

    if (age >= 18) {
      // System.out.println("Old enough to vote.");
      
      if (isCitizen) {
        // System.out.println("And you are a citizen, so you can vote!");
      } else {
        // System.out.println("But you must be a citizen to vote.");
      }
    } else {
      // System.out.println("Not old enough to vote.");
    }



    // Logical operators
    boolean isLoggedIn = true;
    boolean isAdmin = false;
    int securityLevel = 1; // 1 = highest

    if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
      System.out.println("Access granted");
    } else {
      System.out.println("Access denied");
    }

    // Try changing securityLevel to test different outcomes:

    // securityLevel 1 = Access granted
    // securityLevel 2 = Access granted
    // securityLevel 3 = Access denied
    // securityLevel 4 = Access denied
   
  }
}