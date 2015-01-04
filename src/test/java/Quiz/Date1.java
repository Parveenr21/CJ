package Quiz;

import java.util.Date;

public class Date1 {

	
	static Date dat1;
	
	public static void main(String ...cccc)
	{
		
		dat1 = new Date();
		
		//dat1.after(Date when)  //return boolean true if dat1 is after than passed date
		
		//dat1.before(Date when) // return boolean true if dat1 is before than passed date
		
		//dat1.toString()  to get current date		
	
		
		
		System.out.println(dat1.toString());
		System.out.println((dat1.before(dat1)));
		
		
		
	}
	
}
