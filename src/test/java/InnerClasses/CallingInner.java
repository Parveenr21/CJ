package InnerClasses;

public class CallingInner {



    public static void main(String[] args) {



        //CALLING  INNER
        //HERE WE HAVE  TO CREATE OUTER CLASS OBJECT

        Outer outerObj=new Outer();
        Outer.Inner innerObj_i=outerObj.new Inner();

        //another way to create object
        Outer.Inner innnerObj=new Outer().new Inner();
        innnerObj.getix();
        innnerObj.getxx();


    }
}
