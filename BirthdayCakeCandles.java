import java.util.Scanner;
public class BirthdayCakeCandles {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count=0;
		int max = 0;
		for(int j=0;j<n;j++)
		{
			arr[j] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
				max =arr[i];
		}
		for(int k=0;k<n;k++)
		{
			if(max == arr[k])
				count++;
		}
		System.out.println(count);
		sc.close();
	}
}
