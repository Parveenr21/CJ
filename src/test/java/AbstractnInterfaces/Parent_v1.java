package AbstractnInterfaces;

public class Parent_v1 {


    private int private_parent=10;
    int default_parent=100;
    protected int protected_parent=1000;
    public int public_parent=10000;






    public void public_parent()
    {
        System.out.println(public_parent);
    }

    void default_parent()
    {
        System.out.println(default_parent);
        //System.out.println(private_parent);
    }


   protected void protected_parent()
    {
        System.out.println(protected_parent);
    }


    private void private_parent()
    {
        System.out.println(private_parent);
    }



}
