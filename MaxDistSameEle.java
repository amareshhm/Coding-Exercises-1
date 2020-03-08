import java.util.Scanner;

public class MaxDistSameEle {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int dist = 0;
			int max = 0;
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i] == arr[j])
					{
						dist = j - i;
					}
					if(dist > max)
					{
						max = dist;
					}
				}
			}
			System.out.println(max);
		}
	}
}
