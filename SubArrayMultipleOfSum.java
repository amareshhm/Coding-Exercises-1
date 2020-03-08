import java.util.ArrayList;

public class SubArrayMultipleOfSum {

	public static void main(String[] args) {
		
		int[] arr = { 7, 5, 3, 7 }; 
		  
	    int N = arr.length;
	    
	    System.out.println(checkSubArray(arr,N));

	}

	private static ArrayList<Integer> checkSubArray(int[] arr, int n) {
		int sum = 0;
		int count = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum = arr[i] + arr[j];
				if(sum % n == 0)
				{
					count++;
					array.add(arr[i]);
					array.add(arr[j]);
				}	
			}
			sum = 0;
		}
		System.out.println("Count: "+count+ " pairs");
		return array;
	}

}
