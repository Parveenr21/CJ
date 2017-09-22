package DataStructures;

public class BubbleSort {



	static void foo(int arr[]){


		for(int i=0;i<arr.length;i++)
		{

			for( int cnt=1;cnt<arr.length-i;cnt++)
			{

				if(arr[cnt]<arr[cnt-1])
				{

					arr[cnt]=arr[cnt]+arr[cnt-1];
					arr[cnt-1]=arr[cnt]-arr[cnt-1];
					arr[cnt]=arr[cnt]-arr[cnt-1];
				}

			}
		}

		for(int cnt=0;cnt<arr.length;cnt++)
			System.out.println(arr[cnt]);
	}

	public static void main(String ...ccc)
	{



		foo(new int[]{1,4,5,3,22,1,0,-11,11,2,1,5,15,0,3,7,5,6,1,0});
	}
}
