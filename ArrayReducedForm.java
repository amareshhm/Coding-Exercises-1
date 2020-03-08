import java.util.Scanner;

public class ArrayReducedForm {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfArrays = sc.nextInt();
		for(int i=0;i<noOfArrays;i++)
		{
			int arraySize = sc.nextInt();
			int[] array = new int[arraySize];
			for(int j=0;j<arraySize;j++)
			{
				array[i] = sc.nextInt();
				
			}
		}
	}

}
