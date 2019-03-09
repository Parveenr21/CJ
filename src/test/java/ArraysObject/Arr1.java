package ArraysObject;

import java.util.Arrays;

public class Arr1 {

	
	
	public static void main(String ...cc)
	{
	 
	 
	  int x[] = new int[10];
	int y[]= new int[10];
	 
	 
	x[0]=1;
	x[1]=1;

	y[0]=1;
	y[1]=1;
	  
	   Arr2 o1[] = new Arr2[10];
	   Arr2 o2[] = new Arr2[10];
	    

	   
	     if(x.equals(y))		//this is just comparing 2 arrays but not arrays object here.. it is behaving just like == operator..
	    	 					//which is comparing the reference of array object which will always be false here
	     {
	     System.out.println("CASE 1");
	     }
	    
	     //arrays do not support any methods besides those provided by Object.
		// Consequently, using Object.equals() on any array compares only array references, not their contents.
	     
	      if(x==y){				
	      
	       System.out.println("CASE2");
	     }
	    
	     
	      if(Arrays.equals(x, y))			//Actual array object comaprison using "ARRAYS.EQUALS(OBJ1, OBJ2)"
	     {
	    	 
	    	 System.out.println("CASE 3");
	     
	     
	     }
	      
	      
	      /*if(Arrays.deepEquals(x, y))				//Deep equls only work for object array means.. array of reference and not on the primitive reference
	      {
	     	 
	     	 System.out.println("CASE 4"); 
	      }
	      
	     
	     else{
	    	 
	    	 System.out.println("NO CONDITION MATCHED");
	     }*/
	    
	   
	   
	   
	 
	 
	
	
	
    if(o1.equals(o2))		//this is just comparing 2 arrays but not arrays object here.. it is behaving just like == operator..
			//which is comparing the reference of array object which will always be false here
{
System.out.println("CASE 1");
}




 if(o1==o2){				

System.out.println("CASE2");
}


 if(Arrays.equals(o1, o2))			//Actual array object comaprison using "ARRAYS.EQUALS(OBJ1, OBJ2)"
{

System.out.println("CASE 3");
/*
HERE this coniditon will get matched... only return true.if both arrays will be of same size and the values set will be same
note default class level int array variable have 0 value by dafult .. but for the reference typed array will be having null value
so this Arrays.equals will also return true heree
*/

}

 
 
 if(Arrays.deepEquals(o1, o2))
 {
	 
	 System.out.println("CASE 4"); 
 }
 
else{

System.out.println("NO CONDITION MATCHED");
}


    
    
  //DEEP EQUALS .. when we have nested  array or array with in array then equals method does not work
	
  	Object[] oo1 = new Object[]{"one", new String[]{"two"}};
      Object[] oo2 = new Object[]{"one", new String[]{"two"}};

      System.out.println("Object array oo1: " + Arrays.toString(oo1) + " and oo2: " + Arrays.toString(oo2));
  System.out.println("Comparing Object Array oo1 and oo2 with Arrays.equals : "       + Arrays.equals(oo1, oo2)); //false
  System.out.println("Comparing Object Array oo1 and oo2 with Arrays.deepEquals : "            + Arrays.deepEquals(oo1, oo2)); //true

  
  
  /***
   * 
   * SO RECOMMENDED WAY IS TO USE DEEPEQUALS FOR OBJECTS ARRAYS AND EQUALS FOR PRIMITIVE ARRAY OBJECT 
   * 
   */
    

}


	
	


	
	
	
	
	
		
	
	
	
	
}
