package Inheritance;

public class ClassABCrunner  {

    public static void main(String[] args) {
        ClassB b =new ClassB();

        System.out.println(b instanceof ClassB);
        System.out.println(b instanceof ClassA);
        System.out.println(b instanceof ClassC);
        System.out.println(b instanceof ClassC);

    }
}
