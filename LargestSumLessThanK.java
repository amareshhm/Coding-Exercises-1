import java.util.Arrays;

public class LargestSumLessThanK {

	static void maxSum(int[] array,int n,int k)
	{
		int p = 0;
		
		Arrays.parallelSort(array);
		
		for(int i=0;i<n;i++)
		{
			if(array[i] >= k)
			{
				p = i;
				break;
			}
		}
		
		int maxSum =  0, a = 0, b = 0;
		for(int i=0;i<p;i++)
		{
			for(int j=i+1;j<p;j++)
			{
				if(array[i] + array[j] < k &&
					array[i] + array[j] > maxSum)
				{
					maxSum = array[i] + array[j];
					
					a = array[i];
					b = array[j];
				}
			}
		}
		System.out.println(a+ " " +b);
	}
	public static void main(String[] args) {
		
		int []arr = {5, 20, 110, 100, 10};  
	    int k = 85; 
	  
	    int n = arr.length; 
	      
	    maxSum(arr, n, k);
	}

}
