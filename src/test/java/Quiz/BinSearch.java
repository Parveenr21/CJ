package Quiz;

public class BinSearch {



	public int binSearch(int data[], int var)
	{

		int pos=-1;			//setting -ve default value is best way

		int beginindex=0;
		int endindex=data.length-1;
int mid=0;

		while(beginindex<=endindex)
		{

			mid= (beginindex+endindex)/2;
			
			if(var>data[mid])
			{
				
				beginindex=mid+1;
			}
			else if(var<data[mid])
			{
				
			
				endindex=mid-1;
				
			}

			if(var==data[mid]){
	
	pos=mid;
	break;
	
}


		}




		return pos;
	}


	public static void main(String ...ddd)
	{
		int retvalue=0;

		//retvalue=new BinSearch().binSearch(new int[]{1,7,3,3,2,4,3,5,8},5);

		//This needs sorted array

		retvalue=new BinSearch().binSearch(new int[]{1,2,3,3,7,9,13,15,18},19);
System.out.println(retvalue);

	}

}
