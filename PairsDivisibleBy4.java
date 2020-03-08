import java.util.Scanner;

public class PairsDivisibleBy4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int count = 0;
			for(int x=0;x<n;x++)
			{
				for(int y=x+1;y<n;y++)
				{
					int sum = 0;
					sum = arr[x] + arr[y];
					if(sum % 4 == 0)
					{
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}
