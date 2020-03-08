import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		for(int i=0;i<t;i++)
		{
			String str = s.next();
			char[] chars = str.toCharArray();
			Arrays.parallelSort(chars);
			System.out.println(String.valueOf(chars));
		}
	}

}
