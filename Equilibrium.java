public class Equilibrium {

	static void equi(int[] arr) {
		int n = arr.length;
		int sum1 = 0;
		int i = 0;
		int j = 0;
		int sum2 = 0;
		//int k = 0;
		//while(k++ < n)
		//{
		for (i = 0; i <= j; i++) {
			sum1 += arr[i];
		}
			for (j = i + 1; j < n; j++) {
				sum2 += arr[j];
			}
			if (sum1 == sum2) {
				System.out.println(arr[i]);
				System.out.println(arr[j]);
			} else if (sum1 > sum2) {
				System.out.println("" + (sum1 - sum2));
			} else {
				System.out.println("" + (sum2 - sum1));
			}
		}
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		equi(array);

	}
}
