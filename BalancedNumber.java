import java.util.Scanner;

public class BalancedNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfArrays = sc.nextInt();
		for(int i=0;i<noOfArrays;i++)
		{
			String s = sc.next();
			int left = 0;
			int right = 0;
			int n = s.length();
			for(int j=0;j<n/2;j++)
			{
				left += (int)s.charAt(i);
				right += (int)s.charAt(n-1-i);
			}
			if(left == right)
			{
				System.out.println("1");
			}
			else
				System.out.println("0");
		}
	}

}
