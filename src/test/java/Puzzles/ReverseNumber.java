package Puzzles;

public class ReverseNumber {


    int foo(int input)
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
        int n=1;
        System.out.println(new ReverseNumber().foo(n));
    }


}
