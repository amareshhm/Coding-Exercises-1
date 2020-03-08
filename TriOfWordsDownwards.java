import java.util.Scanner;

public class TriOfWordsDownwards {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while(tc >  0)
		{
			String str = sc.next();
			int k = 1;
			while(k <= str.length())
			{
				for(int j=k;j<str.length();j++)
				{
					System.out.print(".");
				}
				for(int i=0;i<k;i++)
				{
					System.out.print(str.charAt(i));
				}
				System.out.println("");
				k++;
			}
			tc--;
		}

	}

}
