import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hourglass2DArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[6][6];
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = array[i][j] + array[i + 2][j] + array[i][j + 1] + array[i + 1][j + 1] + array[i + 2][j + 1]
						+ array[i][j + 2] + array[i + 2][j + 2];
				arrayList.add(sum);
			}
		}
		Collections.sort(arrayList);
		//getting the last element of sorted array which is the biggest element
		System.out.println(arrayList.get(arrayList.size() - 1));
	}

}
