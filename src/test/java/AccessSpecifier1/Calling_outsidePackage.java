package AccessSpecifier1;

import AccessSpecifier2.PublicClass2;

public class Calling_outsidePackage extends PublicClass2{





    public static void main(String ...xxxx)

    {
//create constructor here..that would be able to call default access specifier constrcutror of parent class once we extends



        new PublicClass2();        //this has everywhere access
      //  new PublicClass2(10);
        //new PublicClass2(10,10); //default access ..cant even access by subclass

        //new PublicClass3();  private constructor..
    }

}



