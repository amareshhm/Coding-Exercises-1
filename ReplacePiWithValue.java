import java.util.Scanner;

public class ReplacePiWithValue {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(replacePi(s));

	}

	static String replacePi(String s) {
		
		if(s.length() <= 1)
			return s;
		
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i')
		{
			return "3.14" + replacePi(s.substring(2,s.length()));
		}
		else
		{
			return s.charAt(0) + replacePi(s.substring(1,s.length()));
		}
	}

}
