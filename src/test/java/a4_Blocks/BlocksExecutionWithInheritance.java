package a4_Blocks;

 class A
{
    int i;

    static
    {
        System.out.println("Class A SIB");
    }

    {
        System.out.println("Class A IIB");
    }

    A()
    {
        System.out.println("Class A Constructor");
    }
}

class B extends A
{
int j=1;
    {

 j=1000;
    }


    B(int i)
    {
        j=i;
        System.out.println("hi");
        System.out.println(j);
    }



}


/*

Firstly.. superclass is loaded with static block init block and constructor calling.. then we have child.. static blocll
constructor start..with first call to INITblock and then further construcor code and inititalization of instance variable.


 */

public class BlocksExecutionWithInheritance
{
    public static void main(String[] args)
    {
        B b = new B(99);


    }
}