package Json;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.util.JSONPObject;


public class Json_OBSOLETE {

	 public static JSONObject obj ;
	 
	 
	 
	 
	
	public static  void main(String[] args) throws JSONException, JsonGenerationException, JsonMappingException, IOException 
	   {
	       obj = new JSONObject();  //JSON object is used to create json objects in java  

	      obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(
	    		  1000.21));
	      obj.put("is_vip", new Boolean(true));

	      System.out.println(obj);
	
	   
	   System.out.println(obj.get("name"));
	   
		
	
	   /*
	    * 
	    * we are not using JSONObject to create json as this would be incompatible with object mapper of Jackson library
	    * 
	    * 
	    */
	   
	   
		
		/*
		 * 
		 * In case we directly pass this object or JSON object to mapper.write values and even to writevalueasString method
		 * we get a run time exception
		 * 
		 * No serializer found for class org.json.JSONObject and no properties discovered to create BeanSerializ
		 * 
		 * so change it to string first.
		 */
		
		
		
		//System.out.println(mapper.writeValueAsString(obj.toString()));
		
		
	   
	 parsing();
	   
	   }
	
	
	/*
	 * Now to parse JSON object we need JSON parser
	 * 
	 */
	
	
	public static void parsing() throws JsonProcessingException, IOException
	{
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode Output=mapper.readTree(new File("d:\\user.json"));
	
		
		
		
		System.out.println(Output.findValue("balance"));
	
	}
	
	
	
}
