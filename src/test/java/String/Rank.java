package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Rank{
	
	
	int x[]=new int[10];
	int sum=0;
	
	void setMarks(int i,int index){
		x[index]=i;
	}
	
	
	void sumStudent(){
		
		for (int i=0;i<=9;i++){
		sum =sum+x[i];	
	
		}
		System.out.println("sum is "+ sum);
	
	}
	
	void exec() throws NumberFormatException, IOException{
		
		int i=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{		
			
		int x=Integer.parseInt(br.readLine());
		this.setMarks(x,i );
		i++;
		}while(i<10);	
	   
		this.sumStudent();
	
	
	}
	
	public static void main(String ...xxx) throws NumberFormatException, IOException{
		
		
		Rank R =new Rank();
		R.exec();
		
		
	}
	
}