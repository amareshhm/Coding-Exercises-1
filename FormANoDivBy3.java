import java.util.Scanner;

public class FormANoDivBy3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfArrays = sc.nextInt();
		int sum = 0;
		for(int i=0;i<noOfArrays;i++)
		{
			int arraySize = sc.nextInt();
			int[] array = new int[arraySize];
			for(int j=0;j<arraySize;j++)
			{
				array[j] = sc.nextInt();
				sum = sum + array[j];
			}
			if(sum % 3 == 0)
			{
				System.out.println("1");
			}
			else
				System.out.println("0");
		}
	}

}
