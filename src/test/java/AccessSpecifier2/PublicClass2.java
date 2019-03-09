package AccessSpecifier2;

//Public class with default constructor

 public class PublicClass2 {

	
	 public PublicClass2()

	 {
	 	
	 System.out.println(getClass());	
	 	
	 }


	 protected PublicClass2(int a)

	 {

		 System.out.println(getClass());

	 }


	  PublicClass2(int a,int b)

	 {

		 System.out.println(getClass());

	 }
	 
}
