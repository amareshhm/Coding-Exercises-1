import java.util.ArrayList;

public class SortListBasedOnStringLength {

	public static ArrayList<String> sortListAccordingToStringLength(ArrayList<String> arr)
	{
		String temp = null;
		for(int i=0;i<arr.size()-1;i++)
		{
			if(arr.get(i).length() > arr.get(i+1).length())
			{
				temp = arr.get(i);
				arr.set(i,arr.get(i+1));
				arr.set(i+1,temp);
			}
		}
		return arr;	
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> words = new ArrayList<String>();
		words.add("java");
		words.add("javas");
		words.add("strings");
		words.add("ringaringa");
		words.add("singer");
		System.out.println(SortListBasedOnStringLength.sortListAccordingToStringLength(words));
	}
}
