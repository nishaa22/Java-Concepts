// Strings in java

public class Strings{
  public static void main(String[] args){
    String name = "Nisha";
    // System.out.println(name);


    // string length
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    // System.out.println("The length of the txt string is: " + txt.length());



    // uppercase and lowercase
    String s = "Hello World";
    // System.out.println(s.toUpperCase());
    // System.out.println(s.toLowerCase());



    // indexOf - returns the first occurence
    String s1 = "Please locate where 'locate' occurs";
    // System.out.println(s1.indexOf('locate')); // error because of ''
    // System.out.println(s1.indexOf("locate")); 



    // charAt
    String s2 = "Hello";
    // System.out.println(s2.charAt(4));
    // System.out.println(s2.charAt(2));



    // compare two strings
    String txt1 = "Hello";
    String txt2 = "Hello";

    String txt3 = "Greetings";
    String txt4 = "Great things";

    // System.out.println(txt1.equals(txt2));  // true
    // System.out.println(txt3.equals(txt4));  // false



    // trim - remove whitespaces
    String txt5 = "   Hello World   ";
    System.out.println("Before: [" + txt5 + "]");
    System.out.println("After:  [" + txt5.trim() + "]");



    // concatenation
    String myName = "Nisha";
    int age = 25;
    // System.out.println("I am " + myName +". " + "My age is " + age + ".");

    String fname = "Nisha";
    String lname = "Singh";
    // System.out.println(fname.concat(lname));



    // special characters
    String s4 = "We are the so-called \"Vikings\" from the north.";
    System.out.println(s4);
    String s5 = "It\'s alright.";
    System.out.println(s5);
    String s3 = "The character \\ is called backslash.";
    System.out.println(s3);


  }
}