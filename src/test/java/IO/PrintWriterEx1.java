package IO;

import java.io.*;
public class PrintWriterEx1 {

	//Console Output using CharStrem.. PrintWriter class
	//Console output of the chars from the code itself
	
	public static void main(String...sss)
	{
		PrintWriter pw = new PrintWriter(System.out, true);
		
		
		
		
		
						pw.println("This is a string");
		int i = -7;
						pw.println(i);
		double d = 4.5e-7;
						pw.println(d);
	
						
						
						//we can achieve this by the System.out to write simple text output
						//to the console when you are learning Java or debugging your programs. However, using a
						//PrintWriter will make your real-world applications easier to internationalize
						
	}
	
}
