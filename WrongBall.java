import java.util.Scanner;

public class WrongBall {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int count = 0;
			String s = sc.next();
			if(s.charAt(0) == 'B')
				count++;
			
			for(int i=1;i<s.length();i++)
			{
				if((s.charAt(i) == 'R' && i%2 != 0) || (s.charAt(i) == 'B' && i%2 == 0))
				{
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
