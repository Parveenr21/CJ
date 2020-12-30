package Arrays;

public class PrintEquilateralTriangle {


    public static void main(String ...ccc)
    {


        int x=5;


        for(int i=0;i<x;i++)
        {


            for(int j=0;j<=x/2-i;j++)
            {
                System.out.print(" ");

            }

            for(int j=0;j<=i;j++)

            {

                System.out.print("* ");
            }

            for(int j=0;j<=x/2-i;j++)
            {


            }

            System.out.println(" ");
        }

    }

}
