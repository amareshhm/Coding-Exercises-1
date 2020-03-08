import java.util.Scanner;

public class AppleandOrange {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for(int apple_i=0;apple_i<m;apple_i++)
		{
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for(int orange_i=0;orange_i<n;orange_i++)
		{
			orange[orange_i] = in.nextInt();
		}
		int or = 0;
		int ap = 0;
		for(int i=0;i<m;i++)
		{
			int dist = apple[i] + a;
			if(dist>=s && dist<=t)
			{
				ap++;
			}
		}
		for(int i=0;i<n;i++)
		{
			int dist = orange[i] + b;
			if(dist>=s && dist<=t)
			{
				or++;
			}
		}
			System.out.println(ap+"\n"+or);
	}
}
