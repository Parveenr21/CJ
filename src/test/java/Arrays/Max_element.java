package Arrays;



class Max_element{


  static int max(int []a) 
                                           
            
  {
                                               
                                               
                       
                       int i=0;          
                        int max=a[0];
                        
                        for (i=0;i<a.length;i++)
                        {
                        if(a[i]>max)
                        max=a[i];
                        }
                                  return max;
                                       }
  
  
  
  

  public static void main(String ...aa)
  {
  
  int a=Max_element.max(new int[]{1,2,9,3,4,-1,22,0});
  System.out.println(a);
  }


}