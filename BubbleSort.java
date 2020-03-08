import java.util.Scanner;

public class BubbleSort {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = in.nextInt();
		}
			bubbleSort(a);
	}

	private static void bubbleSort(int[] a) {
		int numOfSwaps = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					numOfSwaps++;
				}
			}
			if(numOfSwaps == 0)
				break;
		}
			System.out.println("Array is sorted in "+numOfSwaps+" swaps.");
			System.out.println("First element: "+a[0]);
			System.out.println("Last element: "+a[a.length-1]);
	}

}
