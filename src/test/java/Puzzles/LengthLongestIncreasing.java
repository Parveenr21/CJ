package Puzzles;

public class LengthLongestIncreasing {


    static int foo(int arr[])
    {

        int maxdiff=arr[1]-arr[0];
        int min=arr[0];

        for(int i=1;i<arr.length;i++)
        {
          /* if(arr[i]>arr[i-1])        This is not required
           {*/
               if((arr[i]-min)>maxdiff)
               maxdiff=arr[i]-min;
           //}
           if(arr[i]<min)min=arr[i];

        }


        System.out.println(maxdiff);
    return maxdiff;
    }


    public static void main(String[] args) {
        foo(new int[]{1,3,9,2,4,7,8,5,8,8,9,9,8,9});
    }
}
