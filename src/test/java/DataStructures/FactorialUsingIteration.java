package DataStructures;

public class FactorialUsingIteration {

    public static int foo(int n)
    {
        for(int i=2;i<n;i++)
        {

        n=n*i;
        }

        return n;

    }


    public static  void  main(String ...ddd)
    {


        System.out.println(foo(10));


    }
}
