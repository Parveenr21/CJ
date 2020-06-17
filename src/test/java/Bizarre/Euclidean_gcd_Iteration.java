package Bizarre;

public class Euclidean_gcd_Iteration {

    int foo(int a,int b)
    {


        int q, r;

        // loop till remainder is 0
        while (b > 0)
        {

            //Always get remainder of 2 values and set denominator to remainder and set numberator to the b

            r = a%b;	// remainder

            a = b;
            b = r;
        }

        return a;


    }



    public static void main(String[] args) {

        System.out.println( new Euclidean_gcd_Iteration().foo(90,100));
    }
}
