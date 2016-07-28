package String;

public class ArrayR {
public static void main(String[] args) {
	int[] arry={1,5,9,3,5};
	repeat(arry);
	
}

private static void repeat(int[] arry) {
	// TODO Auto-generated method stub
	int a1= 0;
	for(int i=0;i<arry.length;i++)
	
	{
		for(int j=i+1;j<arry.length;j++)
		{
		
			if(arry[i]==arry[j])
			{
				a1= arry[i];
				
			}
			}
		if(a1>0)
		{
			break;
		}
		}
	if(a1>0)
	{
	System.out.println(a1);
	}
	else
	{
		System.out.println("no repeated elements");
	}
	}
}

