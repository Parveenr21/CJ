package IO;


import java.io.BufferedReader;
import java.io.FileReader;

class ReadFile{
	//REad file using  buffreed reader.. char Stream.. its best suied for chars or TEXT data.. for other data type
	//say Images ..audio.. use BYTE STREAMS
	
	public static void main(String ...aaaa)
	{
		
		
String s="temp";

		try{
				
				  
					
					FileReader fstream = new FileReader("parveen.txt");
				BufferedReader br = new BufferedReader(fstream);
				
			
				do{
					
					 s= br.readLine();
					if(s!=null)//remove this and see
					 System.out.println(s);
							
					
					
				}while(s!=null);
				
				
				br.close(); 
					  }catch (Exception e){//Catch exception if any
					  System.err.println("Error: " + e.getMessage());
					  
			
		  
		  
		
		
		
	}
	}
}
	
