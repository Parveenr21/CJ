package Arrays;

public class MatrixMultiplication {

	public static void main(String ...ccc)
	{

		int arr1[][]=new int[3][7];
		int arr2[][]=new int[7][5];
		int temp=1;


		
		
		for(int i=0;i<arr1.length;i++) //This is couting tom 0 to no.of columns
		{

			for(int j=0;j<arr1[i].length;j++)
			{

				arr1[i][j]=temp;
				++temp;
			}


		}





		for(int i=0;i<arr2.length;i++)
		{

			for(int j=0;j<arr2[i].length;j++)
			{


				arr2[i][j]=temp;

				++temp;
			}


		}




		System.out.println("Values in the array");

		for(int i=0;i<arr2.length;i++)
		{

			for(int j=0;j<arr2[i].length;j++)
			{


				System.out.println(arr2[i][j]);

			}
			System.out.println("*******");

		}




	}


}
