package String;
class Mergesort{
	
	static void sort(int a[])
	{
	int temp1[],temp2[];	
	int z=0;
	int i=a.length/2;
	int j= a.length-i;
	temp1=new int[i];
	temp2=new int[j];
	int x;
	for (x=0;x<i;x++)
	{
		temp1[x]=a[x];
		System.out.println(temp1[x]);
	}
	for (x=i;x<a.length;x++)
	{
		temp2[z]=a[x];
	
		System.out.println(temp2[z]);
		z=z+1;
	}
	
	sort(temp1);
	sort (temp2);
	}
	
	
		
	
	
	
	
	
	
	
	public static void main(String ...aaa){
		Mergesort.sort(new int[]{1,9,5,2,4,10});
	}
}