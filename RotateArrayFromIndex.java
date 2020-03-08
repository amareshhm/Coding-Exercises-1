import java.util.Scanner;

public class RotateArrayFromIndex {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfArrays = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<noOfArrays;i++)
		{
			int noOfEle = sc.nextInt();
			int index = sc.nextInt();
			int[] arr = new int[noOfEle];
			for(int j=0;j<noOfEle;j++)
			{
				arr[j] = sc.nextInt();
			}
			for(int j=index;j<noOfEle;j++)
			{
				sb.append(arr[j] + " ");
			}
			for(int j=0;j<index;j++)
			{
				sb.append(arr[j] + " ");
			}
			sb.append("\n");
		}
			System.out.println(sb);
	}
	
}
