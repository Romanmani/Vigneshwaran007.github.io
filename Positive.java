import java.util.Scanner;

public class Positive {
public static void main(String args[])
{
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	if(a>0)
	{
		System.out.println("given is positive");
	}
	else if(a==0)
	{
		System.out.println("given is zero");
	}
	else
	{
		System.out.println("given is negative");
	}
}
}
