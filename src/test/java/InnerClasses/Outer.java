package InnerClasses;

public class Outer {

    int x=10;
    static int y=20;
    void getx()
    {
        System.out.println("value of x"+ x);
    }

    static void gety()
    {
        System.out.println("value of y"+ y);
    }


     class Inner{

        int ix=100;

        //non static inner class does not have static members.
        //static int iy=200;
        void getix()
        {

            System.out.println("value of ix is "+ ix);
        }

        //accessing outer class variable
         void getxx()
         {

             System.out.println("value of x is "+ x);
         }

         //Outer static can not be accessed.
        /*static void getiy()
        {

            System.out.println("value of iy is "+ iy);
        }*/




    }

}
