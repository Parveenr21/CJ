package Bizarre;
//import static diff.Methods.*;

//See below we can also import a single static methods also using static import ..and as well 
// as this works for any package

//import static p1.SeleniumWebdriver.Methods.setMethodSTATIC;
//while without static import this importing a single method is illegal in java.. see below

//import diff.Methods.setMethodSTATIC;

/*// SECONDLY both the imports works.. below



 //import diff.Methods; // here we import the Methods class only from a package


 //import diff.*;  // here we import all the classes within the diff package and if there are any other packages
 // within the diff then classes with in that will not be imported.

 class StaticImport{


 public static  void main (String ...xxx)


 {

 Methods.setMethodSTATIC(99);
 Methods.getMethodSTATIC();

 }






 }*/

// Third thing is STATIC import use 

// as the static import is for methods of a class.. and not like normal import which is for a class



//import static Bizarre.Methods.getMethodSTATIC;  //individual static method imported

import static Bizarre.Methods.getMethodSTATIC;
import static Bizarre.Methods.setMethodSTATIC;


class StaticImport {

	public static void main(String... xxx)

	{

		setMethodSTATIC(99);
		getMethodSTATIC();

	}

}
