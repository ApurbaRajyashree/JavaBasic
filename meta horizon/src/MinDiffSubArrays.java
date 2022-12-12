public class MinDiffSubArrays   
{  
  
// a method that computes the minimum difference   

	public int minDiffernce(int set[]) { 
	    
        int sum = 0;
        int n = set.length;
        for(int i=0; i<n; i++) sum+=set[i];
        //finding half of total sum, because min difference can be at max 0, 
        // if one subset reaches half, the other part must be teh other half

        int target = sum/2;
        boolean[][] dp = new boolean[n+1][target+1];//2
        
        for(int i = 0; i<=n; i++) dp[i][0] = true;
        
        for(int i= 1; i<=n; i++){
            for(int j = 1; j<=target;j++){
                if(set[i-1]>j) dp[i][j] = dp[i-1][j];
                else dp[i][j] = dp[i-1][j] || dp[i-1][j-set[i-1]];
            }
        }
        
        // we now find the max sum possible starting from target
        int firstPart = 0;
        for(int j = target; j>=0; j--){
            if(dp[n][j] == true) {
                firstPart = j; break;
            }
        }
        
        int secondPart = sum - firstPart;
        return Math.abs(firstPart - secondPart);
    }
	
// main method  
public static void main(String argvs[])   
{  
// Creating an object of the class MinDiffSubArrays   
MinDiffSubArrays obj = new MinDiffSubArrays();  

int arr[] = {1,2,3,4,5};     
int size = arr.length;  
int ans = obj.minDiffernce(arr);  
  
System.out.println("For the input array: ");  
for(int k = 0; k < size; k++)  
{  
System.out.print(arr[k] + " ");  
}  
System.out.println( );  
System.out.println("The minimum difference between the two subarrays is: " + ans + "\n" );  

}  
}  