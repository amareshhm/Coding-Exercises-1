import java.util.Scanner;

public class KthSmallestElement {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		int noOfArrays = sc.nextInt();
		for(int i=0;i<noOfArrays;i++)
		{
			int sizeOfArray = sc.nextInt();
			int[] arr = new int[sizeOfArray];
			for(int j=0;j<sizeOfArray;j++)
			{
				arr[j] = sc.nextInt();
			}
			
			int k = sc.nextInt();
			
			for(int x=0;x<sizeOfArray;x++)
			{
				for(int y=x+1;y<sizeOfArray;y++)
				{
					if(arr[x] > arr[y])
					{
						temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
					}
				}
			}
			System.out.println(arr[k-1] + " ");
		}
		

	}

}
