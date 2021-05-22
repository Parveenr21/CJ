package Inheritance;

public class ClassB extends ClassA{

    static int s1=100;
    int nonst1=111;

    static void foo_static()
    {
        System.out.println("static method class B");
    }
     void foo_nonstatic()
    {
        System.out.println("non static method class B");
        System.out.println(((ClassA)this).nonst1);

    }


    public static void main(String[] args) {
        
        ClassB obj_b=new ClassB();
obj_b.foo_nonstatic();
        System.out.println(ClassB.s1);





    }
    
}
