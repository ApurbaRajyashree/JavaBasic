
public class SumOfNaturalNum {
	public static void sumOfNatural(int n, int sum)
	{
		if(n>10) {
			System.out.print(sum);
			return;
		}
		//sum=sum+n;
		sumOfNatural(n+1,sum+n);
	}
	
	public static void main(String[] args)
	{
		sumOfNatural(1,0);
	}
}
