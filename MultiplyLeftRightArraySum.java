import java.util.Scanner;

public class MultiplyLeftRightArraySum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			
			int[] arr1 = new int[n];
			int[] arr2 = new int[n/2];
			int[] arr3 = new int[n - n/2];
			
			int sum1 = 0;
			int sum2 = 0;
			
			for(int j=0;j<arr1.length;j++)
			{
				arr1[j] = sc.nextInt();
			}
			
			for(int j=0;j<arr2.length;j++)
			{
				arr2[j] = arr1[j];
				sum1 += arr2[j];
			}
			
			for(int j=arr2.length;j<arr1.length;j++)
			{
				arr3[j - arr2.length] = arr1[j];
				sum2 += arr3[j-arr2.length];
			}
			
			System.out.println(sum1 * sum2);
		}

	}

}
