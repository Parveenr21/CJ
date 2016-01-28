package Enumeration;

public class Enum_class2 {

	public enum status
	{
		ACTIVE, INACTIVE, PRIMARY, LINKED 

	}
	
	public enum validationMessages
	{
		can_not_link_sso("Cannot link SSO Account");
		
		private String valMessage;

		validationMessages(String valMessage)
		{
			
			this.valMessage=valMessage;
		}
		
		 public String getMessage() {
		        return this.valMessage;
		    }   
		
		
	}
	
	
	public enum validationMessages1
	{
		can_not_link_sso(400,"Cannot link SSO Account");
		
		private int valCode;
		private String valMessage;

		validationMessages1(int valCode, String valMessage)
		{
			this.valCode=valCode;
			this.valMessage=valMessage;
		}
		
		 public String getMessage() {
		        return this.valMessage;
		    }   
		 
		 public int getCode() {
		        return this.valCode;
		    } 
		
		
	}
	

	
	
	public static void main(String ...ss)
	{
		
		System.out.println(validationMessages.can_not_link_sso);
		System.out.println(validationMessages.can_not_link_sso.getMessage());
	System.out.println(status.INACTIVE);
	
	System.out.println(validationMessages1.can_not_link_sso.getCode());
	System.out.println(validationMessages1.can_not_link_sso.getMessage());
	
	
	}
	
	
	
	
}
