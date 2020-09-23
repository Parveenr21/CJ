package Puzzles;

public class Sample {


    public int foo(int n)
    {
        /*


        6789  9876   67895
        1234   4321  51234
        6473    3746  65473
        678     6785
         */
        int rev_n=reverseNumber(n);
        int remainder=rev_n%10;
        int counter=1;
        while(remainder>5)
        {
            rev_n=rev_n/10;
            remainder=(rev_n%10);
            ++counter;
        }




return 1;


    }

    /*

    make return array with sum of that 

     */
    public int reverseNumber(int input)
    {

            int r=0;
            int remainder=0;


            while(input!=0)
            {
                remainder=(input%10);
                input=input/10;

                r=(r*10)+remainder;
            }


            return r;
        }


        public static void main(String[] args) {


        new Sample().foo(1234);

    }
    }
