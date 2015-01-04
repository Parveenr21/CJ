package Search;

class Bin_Search{


	static void fun_search1(int x[],int a)
	{

		int lb=0;
		int ub=(x.length-1);
		int mid=(lb+ub)/2;
		int i;

		while( lb <= ub )
	    {
	      if ( x[mid] < a )
	        lb = mid + 1;    
	      else if ( x[mid] == a ) 
	      {
	        System.out.println(a + " found at location " + (mid + 1) + ".");
	        break;
	      }
	      else
	         lb = mid - 1;
	 
	      mid = (lb + lb)/2;
	   }
	   if ( lb > lb )
	      System.out.println(a + " is not present in the list.\n");
	  }
	


	public static void main(String ...aaa)
	{

		int []z=new int[]{2,5,6,7,8,11,12,14,18,19};

		//int []z=new int[]{1,2,3};


		int x=18;
		Bin_Search.fun_search1(z,x);
		// in called function we always pass values 


	}


}