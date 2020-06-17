package DataStructures;

public class InsertionSort21 {



    static void foo(int arr[])
    {

        for(int i=1;i<arr.length;i++)
        {
            int elem=arr[i];

            int j=i-1;
            while(j>=0&&elem<arr[j])        //here this j>=0 is checked first.
            {

                arr[j+1]=arr[j];
                j=j-1;

            }
            arr[j+1]=elem;


        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }



    }

    public static void main(String[] args) {
         foo(new int[]{13,3,4,6,8,11,4,5,8});
    }
}
