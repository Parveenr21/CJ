package DataStructures;

public class FibonacciUsingRecursion {


    //using recursion I am geting nth element and then another method to print the 1st till nth element

    public static int foo(int n)
    {


        //12358
        //Important concept in RECURSION is a recursive funcion MUST return a value.. which is used with
        //any operator or even with that to perform some operation

        if(n==1) return 1;
        if(n==2) return 2;

        return (foo(n-1)+foo(n-2));  //like this.. a foo(n-1) value is used with another foo(n-2)


    }


    public static void printFibonacciSeries(int n)
    {

        //System.out.println(foo(n));


        while(n>=1)
        {
            System.out.println(foo(n));
            --n;
        }

    }


    public static  void  main(String ...ddd)
    {


        //System.out.println(foo(5));
        printFibonacciSeries(10);

    }

}
