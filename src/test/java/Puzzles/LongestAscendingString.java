package Puzzles;

public class LongestAscendingString {


    static int[] foo(int arr[])
    {

        int bindex=0;
        int eindex=1;
        int fbindex=0;
        int feindex=1;
        int diff=feindex-bindex;

        for(int i=1;i<arr.length;i++)
        {

            if(arr[i]>=arr[i-1])
            {
                ++eindex;
            }

            if(arr[i]<arr[i-1])
            {
                if(eindex-bindex>diff)
                {
                    feindex=eindex;
                    fbindex=bindex;
                }

                bindex=i;
                eindex=i;
            }


        }
        System.out.println(feindex);
        System.out.println(fbindex);

        return new int[]{1,2};




    }


    public static void main(String[] args) {


        foo(new int[]{1,3,9,2,4,7,8,5,8,8,9,9,8,9});

    }
}
