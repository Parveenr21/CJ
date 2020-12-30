package Bizarre;

public class NextBiggerPermutation {

    /*

mplement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.

Given a no, find next no greater than n and having same digits.
If such arrangement is not possible, it must be rearranged as the lowest possible order i.e., sorted in an ascending ord

     */


    void foo(int arr[])
    {

        if(sorted(arr,true))
        {
            //code for reverse Array
        }

        else{

            for(int i=0;i<arr.length;i++)
            {
                if(arr[arr.length-1-i]<arr[arr.length-2-i])
                {

                    replace(arr[arr.length-1-i],arr[arr.length-2-i]);
                    break;

                }


            }


        }

        System.out.println(arr);





    }


    void replace(int a, int b)
    {
         a=a+b;
         b=a-b;
         a=a-b;


    }

    boolean sorted(int arr[],boolean reverse)
    {


        if(reverse)
        {
            for(int i=arr.length-1;i>=0;i--)
            {

                if(arr[i]>arr[i-1])
                {
                    return false;
                }


            }
            return true;



        }
        else{

            for(int i=arr.length-1;i>=0;i--)
            {

                if(arr[i]<arr[i-1])
                {
                    return false;
                }


            }
            return true;



        }





    }


    public static void main(String[] args) {
        new NextBiggerPermutation().foo(new int[]{5,7,1});
    }
}
