import java.util.Scanner;

////Decrement count of no of characters from 5 to 1
//Compare next char with first char and loop
//Get the count in loop
public class AlternatingCharacters {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		while(t-- > 0) 
		{
			int count = 0;
			String str = s.nextLine();
			for(int i=1;i<str.length();i++)
			{
				if(str.charAt(i) == str.charAt(i-1))
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
