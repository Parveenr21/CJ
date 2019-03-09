package a1_Variables;

class Variables1{
	
	
	byte b;			//1 byte
	short s;		// 2byte
	int i;			//4 byte
	long l;			//8 byte
	
	char c;			//2 byte
	
	boolean bool;	//it should take 1 bit but officially nothing has been specified by Sun about this
	
	float f;		//4 byte
	double d;		//8 byte
	
	Char_int reference;
	
	
	
	public static void main(String ...xxx)
	{
		
		//integer literals in java are by default int
		
		//floating literals are by default double
		
		//operation on variables and their result datatypes
				
		// int with any variable lower than this ..like byte short and int will result in int
		
		//long with any variable lower than this.. like byte short int and long will result in long
		
		
		// float and long will result in float (16 byte getting cast to 8 byte)
		
		
		
		
		
		
		new Variables1().workingmethod();
		
		
		
		
		
		
		
	}
	
	
	public void workingmethod()
	
	{
		
		b=10; //fine as this is the only way to pass value to byte
		
		//b=b+10; //here 10 is acting as literal so it is int
		
		b = (byte)(b+10);
		
		// b=b+b;  //here also 2 bytes addition gives int
	
		b = (byte)(b+b);
		
		
		s= 10;
		
		//s= s+10;
		//s= s+s;
		
		s = (short)(s+10);
		s = (short)(s+s);
		
		
		i=10;  //10 going as int
		i=i+b;  //int and byte resulting in int
		i=1+10;  //int and integer literal
		i=i+i; // int and int resulting in int
		
		
		
		l=10; //10 going as long
		l=l+10; //int and long going as long default
		l=l+l; //long and long operation as long
		l=l+i; //long and int going as long
		
		i =(int)(l+i);
		
		f=f+i;
		d=d+i;
		//f= 10.5+10;    //default floating literal will be double.
		
		f = (float)(10.5+10); 
		d=10.5+10;
		
		
		
		
		
		//CHAR with CHAR results in 
		
		
		char cc1='a';
		char cc2 ='b';
		
		char cc3 = (char) (cc1+cc2); //here cc1 with cc2 results in int by default .. so we need to cast this to char
		
		
		//char can be casted to int as int is of 4 bytes 32 bit while char is of 2 byte
		
		int ii=1;
		char cc='1';
		
		//printing the value as accepted by datatype
		System.out.println(ii); 
		System.out.println(cc);
		
		
		// char cc ='1' is same as int ii =1 ..just the difference in storing bits
		
		int i3=(int)cc; //casting ascii value of 1 from 16 bit to 32 .. so value remains same
		char c3=(char)ii; //casting ascii value of 1 from 32 bit to 16 .. so value remains same
		
		System.out.println(i3);  //print 1 
		System.out.println(c3);  //print the char of the value stored 
	
		System.out.println((int)c3); 
		
		System.out.println((char)49);
		System.out.println((char)58);
		//System.out.println((int)'58');   58 is invalid char constant
		
		
		System.out.println((int)'1');
		System.out.println(1);
		
		//narrowing is not implicit.. so we need to do casting manually.. it may result in data loss
		int i4= (int)10l;
		
		
		//automatic type casting (its widening) or type promotion
		long l4 = i4;
		
		double d4=10.5f;
		
		float f4 =(float)10.5;
		float f5=(float)10.5d;
		
		
		
		//Auto matic type promotion
		
		
		//byte gets to short, short to int, int to long .. this is the priority.. highest first
		
		short s6=b;  //1 byte to 2 byte
		int i6=b;	//2 byte to 4 byte
		long l6=i;	//4 byte to 8 byte
		float f6=10l; // 8 byte to 4 byte.. here we have issues but very rarely.. java has done this implementation
		double d6=10l; //8byte to 8 byte
		
			
	}
	
	
	
	
	
	
	
}