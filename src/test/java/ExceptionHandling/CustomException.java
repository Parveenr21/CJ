package ExceptionHandling;


import java.io.IOException;



class CustomException{
	
	int k=0;
	static int z=0;
	
	public void finalize(){
		
		System.out.println("finalize executed");
		
	}

	public void exec3() throws TestException
	{
	
		throw new TestException("TESTSSS");
		
	}
	
public void exec2() throws IOException
{
	
	try{
	exec3();
	}
	
	catch(Exception e)
	{
		System.out.println("custom exception");
		
	}
	throw new IOException();                  
	
}

public void exec1() throws NullPointerException, IOException{
	int a=1;
	
	try{
	exec2();                          //This calling resulted in a new IOException object so this will be handled or thrown no further CPU cycles will be given to next statement here.
	}							//Stack will start getting unwinded.
	
	/*catch(Exception e )
	{
		
	}*/
	
	finally{         //it will always come with try and catch so that it can only handle unhandled exception of this block only.
		
		System.out.println("It will also be executed even exception come before this statement");

	}
	
	/*when we dont have catch block.. then we have abnormal termination of the program and so the 
	program execution will not go further and it wil be stopped after execution of finally Block. but if we
	have a catch block then it will be executed normally after executing finally block
	*/
	
	
	if(a==1)
	{
	throw new NullPointerException();		//So this will not be called
	}
}
	
	public void exec()
	
	{

		
		
		
		try{
			exec1();	//This is throwing IOException
			k=1/0;  //similary here no exception will be throws here as well
			
		}

		catch(NullPointerException e1)               // so here IO Exception is not getting catched.it will check for other catch else move out of this call and will check for handler outside
		
		{
					
					System.out.println("Null Pointer Exception catched and handle executed");
					//e.printStackTrace();	
				}
		
		catch(Exception e)
		
		{
					
					System.out.println("Exception catched and handle executed");
					//e.printStackTrace();//printStackTrace is always at handler	
				}

		
	
		finally{         //it will always come with try and catch so that it can only handle unhandled exception of this block only.
			
			System.out.println("finally will always be executed");
	
		}
	
		
	}
		public static void main(String ...adsdas) throws Exception
		{
			CustomException A=new CustomException();
	//A.exec();
	
	A.exec1();
	
		}
	}

	
	