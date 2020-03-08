import java.util.Scanner;

public class AanviLovesChocolates {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=0;i<input;i++)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int j=0;j<n;j++)
			{
				a[j] = sc.nextInt();
			}
			
			int p = 0;
			int q = n-1;
			while(!(p == q))
			{
				if(a[p] > a[q])
				{
					p++;
				}
				else
				{
					q--;
				}
			}
			System.out.println(a[p]);
		}

	}

}
