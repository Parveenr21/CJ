package Puzzles;

public class FindkMaxterm {


    void foo(int nums[], int k)
    {
        int[] maxNums = new int[k];
        for (int n : nums) {
            int f = n;
            for (int j = 0; j < k; j++) {
                int temp = 0;
                if (maxNums[j] < f) {

                    temp = maxNums[j];

                    maxNums[j] = f;
                    f = temp;
                }
            }
        }


        for(int kk:maxNums)
        {
            System.out.println(kk);
        }

    }


    public static void main (String ...rrr)
    {

        new FindkMaxterm().foo(new int[]{1,3,4,6,7,1,2,3,4,8,9,66,7,44,55},6);

    }

}



