package IO;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedStreamReader2{
	
	//Reading Lines from the console using Char Stream using Buffered Reader class
	//Reading Line.. user method.. readline() instead of read
	
	// here only the text or string.. entered till the Carriage RETURN is pressed in stroed in buffer.
	//so to store it more and see it later .. we can store it in a temp string variable and show it later
	//Check the ByteStreamRead3.java
	
	public static void main(String ...xxx) throws IOException{
		String c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String, \"q\" to quit.");
		do {
			c =  br.readLine(); //it reads a character from the stream.. and returns an int for that 
			
			//even if u pass many characters.. like string.. then only the last one will be read..
			System.out.println(c);
			}while(!c.matches("q"));   //!c.equals("q");
		
	}
	
}