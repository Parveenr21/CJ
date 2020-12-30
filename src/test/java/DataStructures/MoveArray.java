package DataStructures;



public class MoveArray {


    static void foo(int arr[],int n)
    {

        //move array to right means.i-n is setting to i..we need array element at

        int b[]=new int[arr.length];

    for(int i=0;i<arr.length;i++)
    {
        int counter =i-n;
        if(counter<0)counter=i-n+arr.length;

        b[i]=arr[counter];

    }

        System.out.println();
    }

    public static void main(String[] args) {
        foo(new int[]{13,3,4,6,8,11,4,5,8},2);
    }
}
