package AbstractnInterfaces;
class A_array{


	static int max(int []a) 

	{



		int i=0;          
		int max=a[0];
		System.out.println("length of arry"+ a.length);
		
		//length is final variable applicable for arrays.. by default ..it has value of length of array
		//length() is the final method applicable for String object which has value of length of String
		
		for (i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}

	public static void main(String ...aa)
	{

		int a=A_array.max(new int[]{1,2,9,3,4,-1,22,0});
		System.out.println(a);
	}


}