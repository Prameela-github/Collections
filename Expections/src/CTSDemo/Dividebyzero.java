package CTSDemo;
import java.util.Scanner;
public class Dividebyzero {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a;
	try {
	 a=sc.nextInt();
		
	}
	catch(Exception e)
	{
		System.out.println("Invalid number");
		a=0;
	}
	System.out.println("Value of a: "+a);
	sc.close();
}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	