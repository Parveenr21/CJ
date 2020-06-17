package AbstractnInterfaces;

import org.apache.velocity.test.provider.Child;

class Caller {


    public static void main (String ...ccc)
    {


        System.out.println(new Inheritance().x);
        System.out.println(new Inheritance().y);



    }

}





public class Inheritance extends Parent {

    int x=100;
    static int y=200;


     void foo2()
    {

        System.out.println("child instance");

    }

    public static void main (String ...ccc)
    {


        System.out.println(new Inheritance().x);
        System.out.println(y);


        foo1();
        new Inheritance().foo2();
    }



}



class Parent{


    int x=10;
    static int y=20;

    static void foo1()
    {

        System.out.println("parent static");

    }

    void foo2()
    {

        System.out.println("parent instance");

    }




}
