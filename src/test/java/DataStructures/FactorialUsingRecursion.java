package DataStructures;

public class FactorialUsingRecursion {




    public static int foo(int n)
    {

        if(n==0||n==1) return 1;
        return n*foo(n-1);


    }


    public static  void  main(String ...ddd)
    {


        System.out.println(foo(10));


    }

}
