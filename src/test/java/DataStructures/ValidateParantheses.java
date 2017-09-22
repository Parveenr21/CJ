package DataStructures;

public class ValidateParantheses {

	
	
	
	
	
	
	static class Stack{
		
		
		char sizee[] = new char[1000];
		
		int top=-1;// starting with -1 .. for an empty stack
		
		void push(char input)
		{
			
			if(top==sizee.length)		//Array has length ..variable.. while String has length() method
			{
				System.out.println("stack full");
				return;
			}
			
			sizee[++top]=input;
			
		}
		
		
		void pop()
		{
			
			if(top==0)
			{
				System.out.println("Empty stack");
			return;
			}
			
			top=top--;
			
		}
			
			boolean isEmpty()
			{
				
			if (top==0)	
				return true;
			
			return false;
			
		}
		
		
		
		
		public static void main(String ...cccc)
		{
			
			
			String s= "{{{}{}{}{{}{}{}}}}}}}{";
			Stack stk = new Stack();
			
			for(int i=0;i<s.length();i++)
			{
				
				if(s.charAt(i)=='{')
				{
					stk.push(s.charAt(i));
					
				}
				
				else if(s.charAt(i)=='}'&&!stk.isEmpty())
				{
					
					stk.pop();
					
				}
				
				else  {
					
					System.out.println("starting with closing parantheses");
				}
				
				
				
				
				}
			
			if(stk.isEmpty())
				System.out.println("paranetheses are correct ordered");
				
			else
				System.out.println("paranetheses are not correct ordered");

			
			
			
			
			
		}
		
		
		
	}
	
	
}
