package IO;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ByteStreamRead{

	
	//Reading Chars using Console.. CharStrem using BufferedReader class
	
	//Reading Chars
	public static void main(String ...xxx) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' to quit.");
		do {
			c = (char) br.read(); //it reads a character from the stream.. and returns an int for that 
			
			//even if u pass many characters.. like string.. then only the last one will be read..
			System.out.println(c);
			}while(c != 'q');
		
	}
	
}