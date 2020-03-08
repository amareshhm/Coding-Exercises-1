import java.util.Scanner;

public class MaximumDifference {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int q=0;q<t;q++)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			
			int maxDiff = 0;
			int sum = 0;
			for(int i=0;i<n-1;i++)
			{
				sum += a[i+1] - a[i];
				if(sum > maxDiff)
					maxDiff = sum;
				if(sum < 0)
				{
					sum = 0;
				}
			}
			System.out.println(maxDiff);
		}
	}
}
