import java.util.Scanner;

public class CountTheZeros {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfArrays = sc.nextInt();
		for(int i=0;i<noOfArrays;i++)
		{
			int count = 0;
			int arraySize = sc.nextInt();
			int[] array = new int[arraySize];
			for(int j=0;j<arraySize;j++)
			{
				array[j] = sc.nextInt();
				if(array[j] == 0)
				{
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
