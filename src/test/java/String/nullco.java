package String;


public class nullco {

	public static void main(String ...ccc)
	{
		
		
		String xx=null;
		String y="yy";
		
				
				if(xx != null)		//null is always compared with the reference value.. which is with the help of == or !=
				{
					System.out.println("null compa");
					
				}
		
				else {
					
					
					System.out.println("false");
				}
		
				
				//null pointer exception
				
				if(xx.equals(null))			// .equals is used to compare objects.. so if null is compard using .equals..obviousl it will give null pointer exception.
				{
					
					System.out.println("String comp true");
				}
					else {
					
					
					System.out.println("String comp false");
				}
				
				
		
	}
}
