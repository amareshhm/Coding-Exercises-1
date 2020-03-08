import java.util.Scanner;

public class LeadersInArray {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int noOfArrays = sc.nextInt();
		for(int i=0;i<noOfArrays;i++)
		{
			int len = sc.nextInt();
			int[] ele = new int[len];
			for(int j=0;j<len;j++)
			{
				ele[j] = sc.nextInt();
			}
			
			for(int z=0;z<len;z++)
			{
				int count = 0;
				for(int y=z+1;y<len;y++) {
					
					if(ele[z] <= ele[y])
						count = 1;
				}
					if(count == 0)
					System.out.print(ele[z] + " ");
			}
			System.out.println();
		}
	}
}
