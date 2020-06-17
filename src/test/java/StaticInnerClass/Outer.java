package StaticInnerClass;
//Static Inner.. Its just like accessing normal one.. inner can access outer class static members
//no access to non static outer class memebers by static inner class
//here no ned to crreate object of outer class

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

    static class Inner{
//static inner class can have both static and non static members

        int ix=100;
        static int iy=200;
        void getix()
        {

            System.out.println("value of ix is "+ ix);
        }


        static void getiy()
        {

            System.out.println("value of iy is "+ iy);
        }

        static void gety()
        {

            System.out.println("value of y is "+ y);
        }


        //NON static members of outer can not be accesses in static inner class

        /* void getx()
        {

            System.out.println("value of x is "+ x);
        }*/



    }


}
