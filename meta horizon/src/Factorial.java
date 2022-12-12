import java.util.Scanner;

public class Factorial {
	public static void factorial(int n, int fact)
	{
		if(n==0)
		{
			System.out.print(fact);
			return;
		}
		//fact=fact*n;
		factorial(n-1,fact*n);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		factorial(n,1);
	}
}
