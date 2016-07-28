package String;

public class Happy {

	public static void main(String[] args) {
	
		answer(20);// TODO Auto-generated method stub
	}
	public static void answer(int n1)
	{
    
      int num;
      int sum=0;
      int temp;
      int count=0;
   
      while(n1>0)
      {
    	  num=n1%10;
    	  temp=(int) Math.pow(num, 2);
    	  sum=sum+temp;
    	  n1=n1/10;
    	  
      }
   
      count=sum;
      System.out.println(count);
      if(count%10==1)
      {
    	  System.out.println(count);
    	  System.out.println("happy number");
 
   }
      else
      {  if(count>9)
      {
    	   answer(count);                                                                             
      }
      else
      {
    	  System.out.println("not happy");
      }
      
    	  
      }
      
	}}


