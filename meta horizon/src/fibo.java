
public class fibo {
	public static void fiboSeries(int a  , int b, int end)
	{
		if(end==15)
		{
			return;
		}
		System.out.print(a+" ");
		fiboSeries(b,a+b,end+1);
	}
	
public static void main(String[] args) {
	fiboSeries(0,1,0);
}
}
