package ProperiesFiles;


import java.io.*;
import java.util.*;

public class Config {
	  String str, key;
	  private String filepath;

	  public Config(String filepath){
		  this.filepath=filepath;
	  }

	  public String ReadProperty(String propkey){
		  String propval="";
		  try{
			  int check = 0;
			  while(check == 0){
				  check = 1;
				  File cfgfile = new File(filepath);
				  if(cfgfile.exists()){
						  Properties props = new Properties();
						  FileInputStream propin = new FileInputStream(cfgfile);
						  props.load(propin);
						  propval=props.getProperty(propkey);
					  }
					  else{
						  check = 0;
				  }
				}
			  }
			  catch(IOException e){
				  e.printStackTrace();
			  }
		return propval;
	  }
}