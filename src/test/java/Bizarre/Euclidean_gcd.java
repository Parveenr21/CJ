package Bizarre;

public class Euclidean_gcd {


    static int foo(int a, int b)
    {
/*

here as we are continuosly making a%b.. so b will be 0 then return a
else a%b on b=0 willbe airthmetic exception.
 */
        if(a==0)return b;
        else if(a==b)return a;
        else {

           return foo(b,a%b);
        }

    }


    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


    public static void main(String[] args) {

        //System.out.println( foo(135,415));
        System.out.println( gcd(415,135));

    }


}
