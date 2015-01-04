package Arrays;


class Min_double_array{


	static int min(int [][]a) 
	{



		int i=0;
		int j=0;
		int min=a[0][0];

		for (i=0;i<a.length;i++)
		{


			for (j=0;j<a[i].length;j++)	
			{
				if(a[i][j]<min)
					min=a[i][j];
			}

		}


		return min;

	}

	public static void main(String ...aa)
	{

		int a[][]= new int[][]{{1,2,9},{3,4,-1},{22,0,}};
		// System.out.println(a[2].length);

		int value= Min_double_array.min(new int[][]{{1,2,-99},{3,4,-1},{22,0,}});
		System.out.println(value);

	}


}