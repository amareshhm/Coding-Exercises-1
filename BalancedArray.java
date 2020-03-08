import java.util.Scanner;

public class BalancedArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int sum = 0;
			int[] a = new int[n];
			for(int i=0;i<n/2;i++)
			{
				sum += (a[i] = sc.nextInt());
			}
			for(int i=n/2;i<n;i++)
			{
				sum -= (a[i] = sc.nextInt());
			}
			if(sum == 0)
			{
				System.out.println(0);
			}
			else if(sum > 0)
			{
				System.out.println(sum);
			}
			else
			{
				System.out.println(Math.abs(sum));
			}
		}

	}

}
