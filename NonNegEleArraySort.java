import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonNegEleArraySort {
	// Sort an array without changing position of negative numbers
	static void sortArray(int[] a, int n) {
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (a[i] >= 0)
				ans.add(a[i]);
		}

		Collections.sort(ans);

		int j = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] >= 0) {
				a[i] = ans.get(j);
				j++;
			}

		}

		for (int i = 0; i < n; i++)
			System.out.println(a[i] + " ");
	}

	public static void main(String[] args) {
		int[] arr = { 2, -6, -3, 8, 4, 1 };

		int n = arr.length;

		sortArray(arr, n);
	}
}
