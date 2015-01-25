package ExceptionHandling;
class Throws2

{
static void throwOne() throws IllegalAccessException {		//remove throws
System.out.println("Inside throwOne.");
throw new IllegalAccessException("demo");
}

public static void main(String args[]) throws IllegalAccessException {		//remove throws
throwOne();
}
}