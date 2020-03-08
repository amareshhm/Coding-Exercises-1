public class RecursiveBinarySearch {

	int binarySearch(int[] array, int low,int high, int input)
	{
		if(high >= low)
		{
			int mid = low + (high - low)/2;
		
		if(array[mid] == input)
			return mid;
		
		if(array[mid] > input)
			return binarySearch(array,low,mid-1,input);
		else
			return binarySearch(array,mid+1,high,input);
	}
		return -1;
	}
	public static void main(String[] args) {
		
		RecursiveBinarySearch rbs = new RecursiveBinarySearch();
		int[] a = {20,30,40,10,50};
		int input = 40;
		int n = a.length;
		int res = rbs.binarySearch(a, 0, n-1, input);
		if(res == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element is present at index: "+res);
	}

}