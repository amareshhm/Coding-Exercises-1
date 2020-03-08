import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueElementArray {
	public static int[] makeUniQueElementArray(int[] a) {
		HashSet<Integer> s = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		int[] b = new int[s.size()];
		int i = 0;
		for (int k : s) {
			b[i] = k;
			i++;
		}
		return b;
	}

	public static void main(String[] args) {
		int[] res = { 1, 2, 4, 3, 2, 5, 6, 5 };
		int[] result = UniqueElementArray.makeUniQueElementArray(res);
		System.out.println("" + result[0] + "" + result[1] + "" + result[2] + "" + result[3] + "" + result[4] + "" + result[5]);
	}
}