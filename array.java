package String;

public class array {
public static void main(String[] args) {
	int[] input1={2,11,7,15};
	int target1=9;
	int sum;
	for(int i=0;i<input1.length;i++)
	{
		for(int j=i+1;j<input1.length;j++)
		{
	        sum=input1[i]+input1[j];
	        if(sum==target1)
	        {
	        	System.out.println(input1[i]+" "+input1[j]);
	        }
	        else
	        {
	        	sum=0;
	        }
		}
	}
}
}
