import java.util.Scanner;

public class TwistedPrime {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfNums = sc.nextInt();
		for(int i=0;i<noOfNums;i++)
		{
			int n = sc.nextInt();
			if(isTwisted(n))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

	private static boolean isTwisted(int n) {
		
		StringBuffer str = new StringBuffer(Integer.toString(n));
		str.reverse();
		int r_n = Integer.parseInt(str.toString());
		if(isPrime(r_n) && isPrime(n))
			return true;
		else
			return false;
	}

	private static boolean isPrime(int z) {
		
		int count = 0;
		for(int i=1;i<=z;i++)
		{
			if(z%i == 0)
			++count;
		}
		if(count == 2)
			return true;
		else
			return false;
	}

}
