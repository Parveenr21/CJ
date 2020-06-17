package Inheritance;

class A
{
    int i = 10;
}

class B extends A
{
    int i = 20;
}

public class Inheritance_another_fields
{
    public static void main(String[] args)
    {
        A a = new B();  //herer 10 will be printed.. as this run-time polymorphism or inheritance is not applicable for data members.

        System.out.println(a.i);
    }
}
