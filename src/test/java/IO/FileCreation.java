package IO;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	
	public static void main(String ...cc) throws IOException{
		
		boolean isdirectorycreated=false;
		boolean isfilecreated=false;
		boolean isdirectorydeleted=false;
		boolean isfiledeleted=false;
		
		File foo= new File("d:\\tempo\\tempi");
		
		/*
		 * mkdirs is used to create parent directory tree completely
		 * while 
		 * mkdir to create a single directory..if the parent exist.
		 */
			
		isdirectorycreated=foo.mkdirs(); 
		
		if (isdirectorycreated==true)
		{
			System.out.println("tempi directory created succesfully");
		}
		else {
			
			System.out.println("tempi directory could not be created");
		}
		
		//we can create file only If the directory exits
		
		
		File foo1 = new File("d:\\tempo\\tempi\\lycos.txt");
		
		isfilecreated=foo1.createNewFile();
boolean fl=foo.mkdirs();

		if (isfilecreated ==true)
		{
			System.out.println("lycos file created succesfully");
		}
		else {
			
			System.out.println("lycos file could not be created");
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("existssss"  + foo.exists());

		System.out.println("absolute existssss"  + foo.getAbsoluteFile().exists());

		File ff=new File("SAmple", "one");


		//ff.createNewFile();
		System.out.println("ff.getAbsolutePath()");
ff.createNewFile();
		System.out.println("ff existssss"  + ff.exists());

		/*
		 * see listing of file in a directory
		 * 
		 */
		boolean flg=false;
		
		String list[]=foo.list();
		
		for(String x:list)
		{
			
			System.out.println(x);
		}
		
		
		
		/*
		 * 
		 * foo.delete will only work..if the directory is empty ..or in case of file
		 */
		
		isdirectorydeleted=foo.delete();
		if (isdirectorydeleted ==true)
		{
			System.out.println("directory deleted succesfully");
		}
		else {
			
			System.out.println("directory could not be deleted");
		}
		
		
		
				/*
				 * delete a file 
				 * 
*/		 
		
		
		
		isfiledeleted=foo1.delete();
		
		if (isfiledeleted ==true)
		{
			System.out.println("lycos file deleted succesfully");
		}
		else {
			
			System.out.println("lycos file could not be deleted");
		}
		

		
		
		
		/* *delete a folder 
		 *
		 *
		 * */
		 
		
		isdirectorydeleted=foo.delete();
		if (isdirectorydeleted ==true)
		{
			System.out.println("directory deleted succesfully");
		}
		else {
			
			System.out.println("directory could not be deleted");
		}
	

	
	}
	
	
	
}
