package String;

public class Reversedigits {
public static void main(String[] args) {
	int number1=1234;
	int n;
	while(number1>0)
	{
		n=number1%10;
		System.out.print(n);
		number1=number1/10;
	}
}
}
