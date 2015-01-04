package Arrays;


class Max_double{


	static int max(int [][]a) 
	{



		int i=0;
		int j=0;
		int max=a[0][0];

		//a.length in 2D array means no of rows we are going to iterate

		for (i=0;i<a.length;i++)
		{


			for (j=0;j<a[i].length;j++)	
			{
				if(a[i][j]>max)
					max=a[i][j];
			}

		}


		return max;

	}

	public static void main(String ...aa)
	{

		int a[][]= new int[][]{{1,2,9},{3,4,-1},{22,0,}};

		//    lets print an index length       
		System.out.println(a[2].length);

		int value= Max_double.max(new int[][]{{1,2,99},{3,4,-1},{22,0,}});
		System.out.println(value);

	}


}