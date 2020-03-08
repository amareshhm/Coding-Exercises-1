import java.util.Scanner;

public class DiaDiff {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int array[][] = new int[n][n];
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < n; i++) {		//here n is size of 1 row of array
			for (int j = 0; j < n; j++) {
				array[i][j] = in.nextInt();
			}
			sum1 += array[i][i];
			System.out.println(i + "---------------");
			System.out.println(sum1);
			System.out.println(array[i][i]);
			sum2 += array[i][n - 1 - i];
			System.out.println(sum2);
			System.out.println(array[i][n-1-i]);
			System.out.println("n="+n);
			System.out.println("---------------" + i);
		}
		System.out.println(sum1);
		System.out.println(sum2);

		int diff = sum1 - sum2;
		if (diff < 0)
			diff *= -1;
		System.out.println(diff);

	}
}