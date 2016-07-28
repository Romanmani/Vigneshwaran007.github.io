package String;

import java.util.Scanner;

public class Fact {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	
	System.out.println(factorial(n1));s.close();
}

private static int factorial(int n1) {
	// TODO Auto-generated method stub
	if(n1==0|n1==1)
	{
		return 1;
	}
	else
	{
		return n1*factorial(n1-1);
	}
}

}
