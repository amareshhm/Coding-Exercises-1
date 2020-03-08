import java.util.ArrayList;
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRecurringStrings {

	public static ArrayList<String> removeRecurringStrings(ArrayList<String> al) {
		Set<String> s = new HashSet<String>();		
		ArrayList<String> arr = new ArrayList<String>();
		s.addAll(al);				//only unique elements are added
		arr.addAll(s);				//all elements are printed, put from hashset into arraylist again as return type is ArrayList
		return arr;
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> array = new ArrayList<String>();
		array.add("Java");
		array.add("Java");
		array.add("DBase");
		System.out.println(RemoveRecurringStrings.removeRecurringStrings(array));
	}
}
