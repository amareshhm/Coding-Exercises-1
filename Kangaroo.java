import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		
		float t = ((float) (x2-x1)/(float) (v1-v2));
		System.out.println((t%1 == 0)&&(t>=0)?"Yes":"No");
		in.close();
	}
}
