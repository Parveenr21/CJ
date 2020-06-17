package StaticInnerClass;



public class CallingInner {



    public static void main(String[] args) {


    //CALLING STATIC INNER
        //NO NEED TO CREATE OUTER CLASS OBJECT
        Outer.Inner innnerObj=new Outer.Inner();
//Also if there is private static members in outer class, that will also be accessed using inner class


        innnerObj.getix();
        innnerObj.getiy();
        innnerObj.gety();

        }



}
