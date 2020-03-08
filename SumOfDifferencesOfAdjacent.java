import java.util.Scanner;

public class SumOfDifferencesOfAdjacent {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfArrays = sc.nextInt();
		for(int i=0;i<noOfArrays;i++)
		{
			int size = sc.nextInt();
			int[] a = new int[size];
			for(int j=0;j<size;j++)
			{
				a[j] = sc.nextInt();
			}
			int sum = 0;
			for(int x=0;x<size-1;x++)
			{
				for(int y=x+1;y<size;y++)
				{
					if((a[x] - a[y]) <= 1)
					{
						sum  += 0;
					}
					else
					{
						sum += (a[y] - a[x]);
					}
				}
			}
			System.out.println(sum);
		}
	}

}
