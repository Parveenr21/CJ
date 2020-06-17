package Arrays;

public class PrintEquilateralTriangle3 {


    public static void main(String ...ccc)
    {


        int x=5;


        for(int i=0;i<x;i++)
        {


            for(int j=0;j<x-i;j++)
            {
                System.out.print(" ");

            }

            for(int j=0;j<=i;j++)

            {

                System.out.print("* ");
            }


            System.out.println(" ");
        }

    }

}
