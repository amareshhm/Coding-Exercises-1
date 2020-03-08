import java.util.Scanner;

public class NoOf1InArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfArrays = sc.nextInt();
		for(int i=0;i<noOfArrays;i++)
		{
			int arraySize = sc.nextInt();
			int[] arr = new int[arraySize];
			int remainder = 0;
			int count = 0;
			int digitToFind = sc.nextInt();
			for(int j=0;j<arraySize;j++)
			{
				arr[j] = sc.nextInt();
				while(arr[j] != 0)
				{
					remainder = arr[j] % 10;
					arr[j] = arr[j] / 10;
					if(remainder == digitToFind)
						count++;
				}
			}
			System.out.println(count);
		}
	}

}
