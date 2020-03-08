import java.util.Scanner;

public class OddEvenChange {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfArrays = sc.nextInt();
		for(int i=0;i<noOfArrays;i++)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j] = sc.nextInt();
			}
			int temp = 0;
			for(int j=0;j<arr.length-1;j++)
			{
				if(j%2 == 0)
				{
					if(arr[j] > arr[j+1])
						temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;
						
				}
			}
			for(int a : arr)
			{
			System.out.print(a + " ");
			}
		}

	}

}
