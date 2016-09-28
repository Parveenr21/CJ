package a1_Variables;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class RandomNumbers
{

public static void main(String ...ccc)
{
	
	//Math class has random method
	
	double rand1=Math.random()*10000000;
	
	
	
	
	System.out.println("no is "+rand1);
	
	String ss="p"+rand1;
	System.out.println("no is "+ss);
	
	//int day = cal.get(Calendar.DATE);
	
	Calendar cal = Calendar.getInstance();
	
	
	/*
	 * 
	 * Classes that use getInstance() methods and the like are of the singleton design pattern. 
	 * Basically, there will only ever be one instance of that particular class, and you get it with getInstance().
	 * 
	 * 
	 * Method getInstance() is called factory method. It is used for singleton class creation. 
	 * That means only one instance of that class will be created and others will get reference of that class.
	 */
	
	int year =	cal.get(Calendar.YEAR);

	
	double redem1=Math.random()*1000000;
	Double redem2=new Double(redem1);
	//int redem3=redem2.intValue();

	redem2.toString();

	System.out.println("redem   is "+redem2.toString());
	

System.out.println("year  is "+year);
	
	
	
	
	
	
}}