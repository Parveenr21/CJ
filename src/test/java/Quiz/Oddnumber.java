package Quiz;

public class Oddnumber {

	
	public static void main(String ...cccc)
	{
		
		
		
		System.out.println(new Oddnumber().isOdd(-11));
		
	}
	
	
	public static boolean isOdd(int i) 
	{
	
		//return i % 2 == 1; //for -ve it will not work
		
		return !(i % 2==0);
	
	
	
	}
}
