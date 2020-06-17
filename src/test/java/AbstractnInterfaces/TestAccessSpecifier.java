package AbstractnInterfaces;

import AbstractnInterfaces.Parent_v1;

public class TestAccessSpecifier {

    public static void main(String... ccc) {


        //Within same package

        new Parent_v1().default_parent();
        new Parent_v1().protected_parent();


        //OUTSIDE package only.. PUblic is accessible .. and protected only using inheritance(Gerneralization) and not using composition.

        new Parent_v1().public_parent();


    }

}