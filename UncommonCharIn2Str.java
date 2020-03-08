import java.util.Scanner;

public class UncommonCharIn2Str {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while(input-- > 0)
		{
			String a = sc.next();
			String b = sc.next();
			for(char i=97;i<123;i++)
			{
				int k = a.indexOf(i);
				int l = b.indexOf(i);
				if((k == -1 && l != -1) || (k != -1 && l == -1))
					System.out.print(i);
			}
			System.out.println();
		}

	}

}
