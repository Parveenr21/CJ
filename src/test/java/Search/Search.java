package Search;
class Search{


	static void fun_search(int x[],int a)
	{

		int i;

		for (i=0;i<x.length;i++)
		{

			if(a==x[i])
			{
				System.out.println("position at index "+ i + "MATCHED" );
				break;
			}


		}
		if(a!=x[i-1])
			System.out.println("not Matched");
	}

	public static void main(String ...aaa)
	{

		int []z=new int[]{10,2,3,4,9,11};

		int x=111;
		Search.fun_search(z,x);
		// in called function we always pass values 


	}


}