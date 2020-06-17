package AbstractnInterfaces;

public class Child_v1 extends Parent_v1{



    public  static void main (String ...ccc)
    {




        //Private DM amd MF can not be inherited..they are just used by creteing that clas object only
        //PRIVATE methods are not even able to access using object...if object creation happens outside class


        System.out.println(new Child_v1().default_parent);
        new Child_v1().default_parent();


        System.out.println(new Child_v1().protected_parent);
        new Child_v1().protected_parent();

        System.out.println(new Child_v1().public_parent);
        new Child_v1().public_parent();



        //new Parent_v1().private_parent();     This is also invalid here we can not access private method even using same class object


        new Parent_v1().default_parent();
        new Parent_v1().protected_parent();
        new Parent_v1().public_parent();
    }

}

