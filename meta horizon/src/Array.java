
public class Array {
	
	public static void loop(int start, int end) {
		if(start>end)
		{
			return;
		}
		System.out.print(start+" ");
		loop(start+1 , end);
	}
	
public static void main(String[] args) {
	Array ar=new Array();
	ar.loop(1,10);
}
}
