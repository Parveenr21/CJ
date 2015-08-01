package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreammmm {
	
	static FileInputStream in = null;
    static FileOutputStream out = null;

	
	public static void main(String args[]) throws IOException
   {
		
      try {
    	// in=new java.io.FileInputStream(new File("inpu"));
         in = new FileInputStream("input.txt");
         out=new java.io.FileOutputStream(new File("output.txt"));
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
            
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}