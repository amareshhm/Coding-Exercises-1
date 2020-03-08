import java.util.Scanner;

public class NoOfPathsInMatrix {
	public static int nop(int m, int n) {
		if (m == 1 || n == 1)
			return 1;
		return nop(m - 1, n) + nop(m, n - 1);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();	
			System.out.println(nop(m, n));
		}
	}
}