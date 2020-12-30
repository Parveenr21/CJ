package Puzzles;

public class Mindist {


    int mindistance(int []a)
    {
        int n=a.length;
        int mindiff=-1;
        for(int i=0;i<n;i++)
        {

            for(int j=i+1;j<n;j++)
            {
                if((a[i]==a[j])&&a[i]!=0)
                {
                    if(mindiff==-1||mindiff>(j-i)) mindiff=j-i;
                }

            }

        }

        return mindiff;
    }





    public static void main(String[] args) {


        System.out.println(new Mindist().mindistance(new int[]{7,1,3,41,7}));
    }

}
