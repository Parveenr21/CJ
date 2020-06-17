package AccessSpecifier1;

import AbstractnInterfaces.Parent_v1;

public class Child_v2 extends Parent_v1 {



    public  static void main (String ...ccc)
    {

        //Private DM amd MF can not be inherited..they are just used by creteing that clas object only


//here DEFAULT can not be accessed as child also if package gets changed among PARENT AND CHILD class

        // System.out.println(new Child_v2().default_parent);
        //new Child_v2().default_parent();


        System.out.println(new Child_v2().protected_parent);
        new Child_v2().protected_parent();


        System.out.println(new Child_v2().public_parent);
        new Child_v2().public_parent();







        //OUTSIDE package only.. PUblic is accessible .. and protected only using inheritance(Gerneralization) and not using composition.

        new Parent_v1().public_parent();



    }

}

