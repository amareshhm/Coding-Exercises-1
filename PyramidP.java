public class PyramidP {

	public static void main(String[] args) {
		
		//First way
		/* for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		} */
		
		//Second way with only 2 loops
		/*for(int i=0;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		//Third way with only 1 loop
		StringBuilder sb = new StringBuilder();
		String sep = "";
		for(int i=0;i<5;i++)
		{
			System.out.println(sb.append(sep).append("*"));
			sep = " ";
		}
	}
}
