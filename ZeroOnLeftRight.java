import java.util.LinkedList;
import java.util.Scanner;

public class ZeroOnLeftRight {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Long number = sc.nextLong();
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while (number > 0) {
		    stack.push((int) (number % 10));
		    number = number / 10;
		}
		System.out.println(stack);
		while (!stack.isEmpty()) {
		  int digit = stack.pop();
		  System.out.print(digit);
		  int count = 0;
		  for(int i=1;i<stack.size();i++)
		  {
			  if(stack.get(i--) == 1 && stack.get(i) == 1 && stack.get(i++) == 0)
			  {
				 count++;
			  }
		  }
		  System.out.println(count);
		}
	}

}
