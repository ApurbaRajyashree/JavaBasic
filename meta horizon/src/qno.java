// Iterative Java program to print sums of all
// possible subsets.
import java.util.*;

class qno {

	// Prints sums of all subsets of array
	static void subsetSums(int arr[], int n)
	{

		// There are total 2^n subsets
		int total = 1 << n;
		int minDifference  = Integer.MAX_VALUE;
		int difference=Integer.MAX_VALUE;
		// Consider all numbers from 0 to 2^n - 1
		for (int i = 0; i < total; i++) {
			int sum = 0;

			// Consider binary representation of
			// current i to decide which elements
			// to pick.
			
			for (int j = 0; j < n; ++j)
				if ((i & (1 << j)) != 0)
					sum += arr[j];

			// Print sum of picked elements.
			System.out.print(sum + " ");
			
			
			difference= 15-sum;
			if(difference<minDifference)
			{
				minDifference=difference;
			}
		
		}
		System.out.println("The minimum difference between the two subarrays is: " + minDifference + "\n" );  
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = new int[] {1,2,3,4,5};
		int n = arr.length;

		subsetSums(arr, n);
	}
}

// This code is contributed by spp____
