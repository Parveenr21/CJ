package a5_Constructor;

public class a2_Clas2 {

	static a3_Clas3 c3;
	
	
	//the same thing happens in sys.out.println 
	
	/*
	 * 
	 * This static block is very much in use here ..as this get called as soon as class get called.
	 * as we gonna acces c3 variable ..then class got loaded and c3 got initialized..so useful for static variables.
	 * 
	 */
	
	static{
		
		//if we dont instantiate this reference variable then on accessing method with this reference 
		//will give null pointer exeception
		
		c3=new a3_Clas3();
		
	}
	
}


/*The println method is little more advanced there we create object of a parent class static way and then in static block
create object of the class which method we want to call.. so overridden method is called..this way
the sysout gives printing on different objects.*/