import java.util.Scanner;

public class PlusMinus {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int pos = 0;
		int neg = 0;
		int zeros = 0;
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (x > 0) {
				++pos;
			}
			if (x < 0) {
				++neg;
			}
			if (x == 0) {
				++zeros;
			}
		}
		System.out.println(pos/(double) n);
		System.out.println(neg/(double) n);
		System.out.println(zeros/(double) n);
	}
}