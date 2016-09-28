package Constructor;

public class Clas2 {

	static Clas3 c3;
	
	
	//the same thing happens in sys.out.println 
	
	static{
		
		//if we dont instantiate this reference variable then on accessing method with this reference 
		//will give null pointer exeception
		
		c3=new Clas3();
		
	}
	
}


/*The println method is little more advanced there we create object of a parent class static way and then in static block
create object of the class which method we want to call.. so overridden method is called..this way
the sysout gives printing on different objects.*/