package Puzzles;

public class longestIncreasingString {

    static int foo(int arr[])
    {

        int min=arr[0];
        int diff=arr[1]-arr[0];

        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]-min>diff)
            {
                diff=arr[i]-min;
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }

    return diff;

    }



    public static void main(String[] args) {
        System.out.println(foo(new int[]{1,3,9,2,4,7,8,5,8,8,9,9,8,9}));
    }
}
