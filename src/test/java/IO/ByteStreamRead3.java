package IO;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ByteStreamRead3{
	
	
	
	
	//Reading Lines in a whole paragraph ////from the console using Char Stream using Buffered Reader class
	// every readline() stored to String array 
	
	
	public static void main(String ...xxx) throws IOException{
		String c[]=new String[100];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String, \"q\" to quit.");
		
		int k=0;
			
					for (int i=0;i<1000;i++)
							{
							c[i] =  br.readLine(); //it reads a character from the stream.. and returns an int for that 
										//if(br.readLine().equals("q"))//wrong piece of code.. it again incrementing to the next buffer
										
											if(c[i].equals("q"))
													{
																	k=i;
																	break;
																}
							}
			//even if u pass many characters.. like string.. then only the last one will be read..
			
					for (int i=0;i<=k;i++)
					{
					System.out.println(c[i]);
					}
		
	}
	
}