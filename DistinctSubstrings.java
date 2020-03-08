import java.util.HashSet;
import java.util.Scanner;

public class DistinctSubstrings {

	static int countTotalDistinct(String str) {
		int count = 0;

		HashSet<String> items = new HashSet<String>();

		for (int i = 0; i < str.length(); i++) {
			String temp = "";
			HashSet<Character> ans = new HashSet<Character>();
			for (int j = i; j < str.length(); j++) {
				temp += str.charAt(j);
				ans.add(str.charAt(j));

				if (!items.contains(temp)) {
					items.add(temp);

					count += ans.size();
				}
			}
		}
		return count;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(countTotalDistinct(s));

	}

}
