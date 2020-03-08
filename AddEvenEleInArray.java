import java.util.Scanner;

public class AddEvenEleInArray {

	static void sumOfEven(int[] arr,int i,int sum)
	{
		if(i<0)
		{
		System.out.print(sum);
		return;
		}
		
		if(arr[i] % 2 == 0)
		{
			sum += arr[i];
		}
		
		sumOfEven(arr,i-1,sum);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sizeOfArray= sc.nextInt();
		int[] arr = new int[sizeOfArray];
		for(int i = 0;i<arr.length;i++)
		{
		arr[i] = sc.nextInt();
		}
		int sum = 0;
		sumOfEven(arr,sizeOfArray-1,sum);
	}

}
