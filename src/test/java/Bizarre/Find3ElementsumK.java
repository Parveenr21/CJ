package Bizarre;

public class Find3ElementsumK {


    boolean foo(int arr[], int elem)
    {

        for(int i=0;i<arr.length-3;i++)
        {



            int l=i+1;
            int r=arr.length-1;

            while(l<=r)

            {
                if(arr[i]+arr[l]+arr[r]>elem)
                {
                    r--;
                }
                else if(arr[i]+arr[l]+arr[r]<elem)
                {
                    l++;
                }
                else return true;


            }



        }

        return false;
    }






    public static void main(String[] args) {

        System.out.println(new Find3ElementsumK().foo(new int[]{1, 6, 5, 8, 8, 8}, 10));

//        System.out.println(find3Numbers(new int[]{1,3,5,8,9,15}, 6,10));

    }
}
