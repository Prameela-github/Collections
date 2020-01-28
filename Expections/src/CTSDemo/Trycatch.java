package CTSDemo;
import java.util.Scanner;
public class Trycatch {
	public static void main(String[] args) {
		int a,b;
		a=10;
		b=0;
			try {
			int fraction=a/b;
		System.out.println("This line will not be Executed");

	}
		catch(ArithmeticException e)
		{
			System.out.println("In the catch Block due to Exception="+e);
		}
			System.out.println("End Of Main");
	}
	}
