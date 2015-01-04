package Quiz;


/*
 * 
 * A call to Class.forName("X") causes the class named X to be dynamically loaded (at runtime). A call to forName("X") causes the class named X to be initialized (i.e., JVM executes all its static block after class loading). Class.forName("X") returns the Class object associated with the "X" class. The returned Class object is not an instance of the "x" class itself.

Class.forName("X") loads the class if it not already loaded
 */

class AClass {
  public AClass() {
    System.out.println("AClass's Constructor");
  }
  static { 
    System.out.println("static block in AClass");
  }
}

public class ClassforName { 
  public static void main(String[] args) {
    try { 
      System.out.println("The first time calls forName:");
      Class c   = Class.forName("Quiz.AClass"); 
      AClass a = (AClass)c.newInstance();

      System.out.println("The second time calls forName:");
      Class c1 = Class.forName("Quiz.AClass");

    } catch (ClassNotFoundException e) {
    	
    	
        
    } catch (InstantiationException e) {
        
    } catch (IllegalAccessException e) {
        
    }
        
  }
}