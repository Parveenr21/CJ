package Bizarre;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//import com.paypal.test.sample.testng.Deleteacc;

public class Append {
	public static void main(String[] args) throws IOException {
	
		File f;

		 f=new File("timings_append.txt");
		
		 		  f.createNewFile();	try{
				  // Create file 
		 			 
					
					FileWriter fstream = new FileWriter("c:\\"+"parveen"+File.separator+"timings_append.txt",true);
		
					
								BufferedWriter out = new BufferedWriter(fstream);
								 
						
								
								//System.out.println(		f.getAbsolutePath());
								

					  
					  out.write("+-+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-+-+");
					 out.newLine();
					  out.write("Total time taken by class  "+Append.class.getName()+ "  is   "+System.currentTimeMillis()/1000+"   Seconds   ");
						 out.newLine();
						  out.write("+-+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-+-+");
					  //Close the output stream
					  out.close();
					  }catch (Exception e){//Catch exception if any
					  System.err.println("Error: " + e.getMessage());
					  
				//	  }
		  
		  }
		 
		 
		
		
		  
		
		
	}

}