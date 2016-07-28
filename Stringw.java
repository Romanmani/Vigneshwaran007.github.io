package String;

import java.util.Scanner;

public class Stringw {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	String str2=scr.nextLine();
	String[] str1=str2.split("");
	String s1="";
	for(int i=str1.length-1;i>=0;i--)
	{
		s1+=str1[i]+"";

		
	}
	System.out.println(s1);
	
	scr.close();		
}
}
