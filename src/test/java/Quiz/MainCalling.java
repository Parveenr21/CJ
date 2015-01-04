package Quiz;

public class MainCalling
{
    public static void method()
    {
        System.out.println("Main");
    }

    public static void main(String[] args)
    {
    	
    	/*
    	 * In case of dynamic binding too.. the static methods.. always belong to reference variable of parent..
    	 * so Dynamic binding is only for the non static methods..
    	 * while both static and non static data members and static methods..will always be called of
    	 * REFERENCE variables class and not the object class
    	 * 
    	 */
    	
    	MainCalling m = new SubMain();
    	SubMain m1 = new SubMain();
        m.method();
        m1.method();
    }
}

class SubMain extends MainCalling
{
    public static void method()
    {
        System.out.println("SubMain");
    }
}