package Quiz;

public class Threading extends Thread {

	
	static String sName = "vandeleur";
	public static void main(String argv[])
	{
		
		Threading t = new Threading(); 
	
	t.piggy(sName); 
	
	System.out.println(sName); 
	
	
	} 
	
	
	public void piggy(String sName)		//here we are passsing a copy of sName and not the actual one
	
	{
	//this.sName = sName + " wiggy";
		
		sName = sName + " wiggy";	//here as this sName is local variable so will not effect sName value inside run method
	
		System.out.println(sName + "**");
		start();  //here once the start() method is called the rest execution gets to separate thread then main.. 
		//and main starts executing rest of the statement inside.
	}
	
	public void run()
	
	{ 
		for(int i=0;i < 4; i++){ 
		
			//this.sName = sName + " " + i;  here both sName belong to class varibale and not the local varibale
			sName = sName + " " + i; 
		System.out.println(sName);
		
		} 
	}
	
	
}
