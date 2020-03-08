import java.util.HashSet;
import java.util.Set;

public class FiboMinChanges {

	public static Set<Integer> fibonacciArray(int[] arr, int n) {
		Set<Integer> s = new HashSet<Integer>();

		int a = 0, b = 1, c;
		s.add(a);
		s.add(b);

		for (int i = 0; i < n - 2; i++) {
			c = a + b;
			s.add(c);
			a = b;
			b = c;
		}

		for (int i = 0; i < n; i++) {
			if (s.contains(arr[i]))
			{
				System.out.println(arr[i]);
				s.remove(arr[i]);
			}
		}

		return s;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 1, 21, 4, 2, 1, 8, 9 };
		int n = arr.length;
		System.out.println(fibonacciArray(arr, n));

	}

}
