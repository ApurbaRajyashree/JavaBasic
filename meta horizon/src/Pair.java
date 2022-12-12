import java.util.Arrays;
import java.util.List;

public class Pair {
 private int left;
 private int right;
 
 public Pair(int left, int right)
 {
	 this.left=left;
	 this.right=right;
 }
 
 @Override
public String toString()
{
	return "[" + this.left +","+ this.right+"]";
}
 
 
public int getLeft() {
	return left;
}



public int getRight() {
	return right;
}

public void setRight(int right) {
	this.right = right;
}

public static void main(String[] args)
{
	List<Pair> pair= Arrays.asList(new Pair(1,3),
			new Pair(2,6),
			new Pair(8,10),
			new Pair(15,18));
	//System.out.println(pair);
}
List<Pair> merge(List<Pair> input)
{
	//logic here
	return null;
}
}

