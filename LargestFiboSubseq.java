import java.util.Scanner;

public class LargestFiboSubseq {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		StringBuilder res = new StringBuilder();
		for(int i=0;i<a;i++)
		{
			int b = sc.nextInt();
			int[] arr = new int[b];
			for(int j=0;j<b;j++)
			{
				arr[j] = sc.nextInt();
				if(Math.sqrt(5*arr[j]*arr[j]+4) == (int)Math.sqrt(5*arr[j]*arr[j]+4) 
						|| Math.sqrt(5*arr[j]*arr[j]-4) == (int)Math.sqrt(5*arr[j]*arr[j]-4))
					res.append(arr[j] + " ");
			}
			res.append("\n");
		}
			System.out.println(res);
	}

}
