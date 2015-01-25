package String;
class StringReversal_noVAr{
	
	public static void main(String ...xxx){
		
		
		StringBuffer str=new StringBuffer("ParveenRawat");
		
		
		
		
		for (int i=0;i<str.length()/2;i++)
		{
			
			
			
		str.setCharAt(i, (char)(str.charAt(i)+str.charAt(str.length()-1-i)));
		str.setCharAt(str.length()-i-1, (char)(str.charAt(i)-str.charAt(str.length()-1-i)));	
		str.setCharAt(i, (char)(str.charAt(i)-str.charAt(str.length()-1-i)));			
			
		}
		
		
		System.out.println(str);
		
	}
	
	
	
}