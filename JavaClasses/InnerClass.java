class Outer{
  int a = 10;

  // private class Inner{} // this will not be accessible 
  class Inner{
    int b = 20;
    public void doSomething(){
      System.out.println("This is the method of Inner class");
    }
  }

  static class AnotherInner{
    int c = 30;
  }
}

public class InnerClass{
  public static void main(String[] args){
    Outer o = new Outer(); // outer class object
    Outer.Inner i = o.new Inner(); //inner class object
    System.out.println(o.a + i.b);
    // method calling of inner class
    i.doSomething();

    // Object creation of static inner class
    Outer.AnotherInner a = new Outer.AnotherInner();
    System.out.println("This is from Another inner class: " + a.c);
  }
}