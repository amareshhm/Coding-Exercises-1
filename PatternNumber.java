import java.util.Scanner;

public class PatternNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int z = 0, x = 0;
		for(int i=0;i<input;i++)
		{
			String str = sc.next();
			if(str.charAt(i) == 'D')
			{
				System.out.println(z + " ");
				z++;
			}
			else if(str.charAt(i) == 'I')
			{
				System.out.println(x + " ");
				x++;
			}
		}

	}

}
