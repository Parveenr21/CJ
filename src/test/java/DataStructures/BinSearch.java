package DataStructures;

import com.google.inject.internal.util.$SourceProvider;

public class BinSearch {


    static int foo(int  arr[],int n)
    {

        int k=-1;
        int bindex=0;
        int lindex=arr.length-1;
        int mid=(bindex+lindex)/2;
        while(bindex<=lindex)               //this bindex<=lindex
        {

            if(n>arr[mid])
            {
                bindex=mid+1;
            }
            else if(n<arr[mid])
            {
                lindex=mid-1;
            }
            else
            {
                return mid;
            }

            mid=(bindex+lindex)/2;


        }





        return k;
    }

    public static void main(String[] args) {
        System.out.println(foo(new int[]{1,4,5,8,9,11,18},11));

    }

}


