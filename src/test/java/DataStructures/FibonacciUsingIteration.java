package DataStructures;

public class FibonacciUsingIteration {


    public static void foo(int n)
    {
        int fib[]=new int[n];
        fib[0]=1;
        fib[1]=2;
        int k=0;

        for(int i=2;i<n;i++)
        {
        fib[i]=fib[i-1]+fib[i-2];


        }

        for(int i=0;i<n;i++)
        {
            System.out.println(fib[i]);


        }

    }




    public static  void  main(String ...ddd)
    {


       foo(10);


    }



}
