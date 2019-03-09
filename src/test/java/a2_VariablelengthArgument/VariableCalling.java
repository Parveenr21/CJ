package a2_VariablelengthArgument;


class VariableCalling{
	
	
	
	public static void main(String ...xxx){
		
		VariableLength.fun_variablelength();
		
		//First priority is given to exact match .. arguments no match
		//Else variable length argument constructor is checked.

		
		VariableLength.fun_variablelength("String1");	
		
		
		VariableLength.fun_variablelength("String1", "String2");
		
	}
	
	
	
}