package IO;


import java.io.BufferedWriter;
import java.io.FileWriter;

class WriteFile{
	//REad file using  buffreed reader.. char Stream.. its best suied for chars or TEXT data.. for other data type
	//say Images ..audio.. use BYTE STREAMS
	
	public static void main(String ...aaaa)
	{
		
		


		try{
				
				  
					
					FileWriter fstream = new FileWriter("parveen.txt");
				BufferedWriter br = new BufferedWriter(fstream);
				
				
					
				br.write("First Line");
				br.write("Second Line");
				//here every time the new file is the same.. and getting overwritten with the data..
				//how to append the data here?
					
					
				
				
		br.close(); //when we are commenting this then the string getting written to file is lost when program exits
					  }catch (Exception e){//Catch exception if any
					  System.err.println("Error: " + e.getMessage());
					  
			
		  
		  
		
		
		
	}
	}
}
	
