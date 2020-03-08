import java.util.Scanner;

public class GradingStudents {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];	
		for(int i=0;i<arr.length;i++)
		{
			int grade = in.nextInt();
			int nextMul = grade+5 - grade%5;
			if(grade >= 38 && Math.abs(grade-nextMul)<3)
				grade = nextMul;
			System.out.println(grade);
		}
	}
}
