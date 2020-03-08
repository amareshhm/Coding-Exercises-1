import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		long max=-1;
		long min=Long.MAX_VALUE;
		long sum=0;
		
		for(int i=0;i<5;i++){
			int a=sc.nextInt();
			sum+=a;
			if(a>max)max=a;
			if(a<min)min=a;
		}
		
		System.out.println(sum-max + " " + (sum-min) );
		sc.close();
	}

}