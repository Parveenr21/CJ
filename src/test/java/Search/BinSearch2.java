package Search;
class BinSearch2{
	
	
	static void fun_search1(int x[],int a)
	{
		
	int lb=0;
	int ub=(x.length-1);
	int mid=(lb+ub)/2;
	int i;
	
	for (i=lb;i<=ub;i++)
	
	
	{
	
  	mid=((ub+lb)/2);
  
  	if(a==x[mid])
  		
    {
  		System.out.println("position at index "+ mid + "MATCHED" );
  	break;
  	 
    }
  	
  if(a>x[mid])
	
	{
    lb=mid+1;
    }
	
	if (a<x[mid])
	{
  
  ub=mid-1;
  }
	
  
  
	
  		
	}
	if (x[0]==a)
		System.out.println("position at index "+ "0" + "MATCHED" );
	else if(a!=x[mid])
	System.out.println("not Matched");
	}
	
	public static void main(String ...aaa)
	{
		
int []z=new int[]{2,5,6,7,8,11,12,14,18,19};

		//int []z=new int[]{1,2,3};

	
		   int x=18;
		   BinSearch2.fun_search1(z,x);
		// in called function we always pass values 
		
		
	}
	
	
}