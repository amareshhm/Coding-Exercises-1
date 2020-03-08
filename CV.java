import java.util.Scanner;

public class CV 
{
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String str = in.next();
		new Solvers().solve(str);	
	}
}
	class Solvers
	{
		public void solve(String str)
		{
			int currLevel = 0;
			int valley = 0;
			boolean isFound = false;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i) == 'U')
				{
					currLevel++;
				}
				else
				{
					currLevel--;
				}
				
				if(currLevel < 0)
				{
					isFound = true;
				}
				
				if(currLevel >= 0 && isFound)
				{
					isFound = false;
					valley++;
				}
			}
			System.out.println(valley);
		}
	}
