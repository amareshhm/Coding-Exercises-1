import java.util.ArrayList;

//Q -> Pass an array of strings as parameter. Remove duplicates from it and return an array containing only unique strings.
//A -> create an empty arraylist arr
//loop the given array & check if it contains same string as original
//if not, add it to arr
//if yes, loop again
public class RemoveDuplicates {

	public static String[] removeDuplicates(String[] str)
	{
		ArrayList<String> arr = new ArrayList<String>();
		for(String s:str)
		{
			if(!arr.contains(s.toLowerCase()))
			{
				arr.add(s);
			}
		}
		return arr.toArray(new String[arr.size()]);
	}
	
	public static void main(String[] args)
	{
		String[] array = {"java","hava","java","mava","sava","hava"};
		String[] arrays = RemoveDuplicates.removeDuplicates(array);
		System.out.println(""+arrays[0]+" "+arrays[1]+" "+arrays[2]+" "+arrays[3]);
	}

}
