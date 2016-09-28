package a5_Constructor;

class CopyConstructor{
	
	
	int a;
	String s="NOTHING";
	
	 CopyConstructor() {
		
	a=15;
	}
	
	
	
	CopyConstructor(int a, String s){
		
		
		this.a=a;
		this.s=s;
	}
	
	
	
	CopyConstructor(CopyConstructor refV){
		
		this.a = refV.a;
		this.s = refV.s;
		
	}
	
	
	
	
	public static void main (String ...ccaac)
	{
		
		CopyConstructor RefVariable=new CopyConstructor(100, "Volvo");
		
		CopyConstructor RefVariable2=new CopyConstructor(RefVariable);
		
		System.out.println(RefVariable.a   + "    "  +   RefVariable.s);
		System.out.println(RefVariable2.a    + "   " + RefVariable2.s);
	}
	
	
	
	
	
}