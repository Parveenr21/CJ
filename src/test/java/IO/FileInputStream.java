package IO;

import java.io.*;

public class FileInputStream {
	FileInputStream in = null;
    FileOutputStream out = null;
	
	
	public static void main(String args[]) throws IOException
   {
      

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
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