import java.util.Arrays;
import java.util.Scanner;

public class OccurenceOfAnagram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfStrings = sc.nextInt();
		
		for(int i=0;i<noOfStrings;i++)
		{
			String string = sc.next();
			String word = sc.next();
			int n = word.length();
			int count = 0;
			
			for(int j=0;j<=string.length()-n;j++)
			{
				String d = string.substring(j,j+n);
				char[] ch1 = d.toCharArray();
				char[] ch2 = word.toCharArray();
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				if(Arrays.equals(ch1, ch2))
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
