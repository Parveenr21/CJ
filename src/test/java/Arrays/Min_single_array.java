package Arrays;


class Min_single_array{


  static int min(int []a) 
                                           
                                            {
                                               
                                               
                          
                             int i=0;          
                        int min=a[0];
                        
                        for (i=0;i<a.length;i++)
                        {
                        if(a[i]<min)
                        min=a[i];
                        }
                                  return min;
                                       }

                                     public static void main(String ...aa)
                                                                         {
                                                                         
                                                                         int a=Min_single_array.min(new int[]{1,2,-9,3,4,-1,22,0});
                                                                               System.out.println(a);
                                                                         }


}