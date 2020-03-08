import java.util.HashSet;
import java.util.Set;

public class Duplicates {

	public static Set<Integer> findDuplicates(int[] input) 
	{
		Set<Integer> duplicates = new HashSet<Integer>();
		
		for(int i=0;i<input.length;i++)
		{
			for(int j=1;j<input.length;j++) 
			{
				if(input[i] == input[j] && i != j)
				{
					duplicates.add(input[i]);
					break;
				}
			}
		}
		return duplicates;
	}
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,4,6};
		Set<Integer> res = Duplicates.findDuplicates(a);
		System.out.println(""+res);
	}

}
