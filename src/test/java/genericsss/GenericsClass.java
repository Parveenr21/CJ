package genericsss;

public class GenericsClass<T> {
	
	T t;		
	
	//Always the instance variable would be of the Generic type..so that we can create 
	//at the time of calling whatever we have.
	
	public void setGeneric(T t)		//setting a generic var
	{
		
		this.t=t;
	}
	
	public T getGeneric()			//returning a generic type
	{
		
		return this.t;
	}
	
	public static void main(String[] args) {
	
		GenericsClass<String> gc1 = new GenericsClass<String>();
		
		GenericsClass<Integer> gc2 = new GenericsClass<Integer>();  //1.7 onwards
		GenericsClass<Integer> gc3 = new GenericsClass<Integer>(); 
		
		gc1.setGeneric("volvo");
		gc2.setGeneric(new Integer(10));

		gc3.setGeneric(20);		//Here Autoboxing .. as Generic works on objects only.

		
		System.out.println(gc1.getGeneric());
		System.out.println(gc2.getGeneric());
		System.out.println(gc3.getGeneric());
	
		/*
		Autoboxing is a process by which primitive type is automatically encapsulated(boxed) into its equivalent type wrapper
		Auto-Unboxing is a process by which the value of object is automatically extracted from a type wrapper.
		
		*/
		
		
	}
	
	
	
	

}
