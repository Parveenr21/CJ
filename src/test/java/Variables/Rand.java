package Variables;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Rand
{

public static void main(String ...ccc)
{
	
	double rand=Math.random()*10000000;
	Double d=new Double(rand);
int rand1=d.intValue();
	System.out.println("no is "+rand1);
	
	String ss="p"+rand1;
	System.out.println("no is "+ss);
	
	//int day = cal.get(Calendar.DATE);
	
	Calendar cal = Calendar.getInstance();
	int year =	cal.get(Calendar.YEAR);

	
	double redem1=Math.random()*1000000;
	Double redem2=new Double(redem1);
	//int redem3=redem2.intValue();

	redem2.toString();

	System.out.println("redem   is "+redem2.toString());
	

System.out.println("year  is "+year);
	
	
	
	
	
	
}}