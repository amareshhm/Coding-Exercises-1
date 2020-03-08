import java.util.Scanner;

public class FindTransitionPoint {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfArrays = sc.nextInt();
		while (noOfArrays-- > 0) {
			int arraySize = sc.nextInt();
			int[] array = new int[arraySize];
			boolean flag = false;
			int i;
			for (i = 0; i < arraySize - 1; i++) {
				array[i] = sc.nextInt();
				if (array[i] != array[i + 1]) {
					flag = true;
					break;
				}
			}
			System.out.println(i);
		}
	}

}
