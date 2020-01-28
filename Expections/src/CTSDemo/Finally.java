package CTSDemo;
import java.util.Scanner;
public class Finally {
	public static void main(String[] args) {
		try {
			int a=20;
			int b=0  ;
			int fraction=a/b;
			System.out.println("This line will not be Executed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("In the catch block due to exception="+e);
			
		}
		finally {
			System.out.println("Inside the finally block");
		}
		}
	}
