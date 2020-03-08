import java.util.Arrays;
import java.util.Scanner;

public class MaximumToys {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int i = 0;
		while(k>=0 && i<n)
		{
			k = k - arr[i];
			if(k<0)
				break;
			i++;
		}
		System.out.println(i);
	}
}
