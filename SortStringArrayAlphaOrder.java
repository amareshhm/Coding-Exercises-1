import java.util.Arrays;
import java.util.Comparator;

public class SortStringArrayAlphaOrder {

	private static void sort(String[] str,String s)
	{
		Comparator<String> myComp = new Comparator<String>()
		{
					@Override
					public int compare(String a, String b) {
						
						for(int i=0;i<Math.min(a.length(), b.length());i++)
						{
							if(s.indexOf(a.charAt(i)) == s.indexOf(b.charAt(i)))
							{
								continue;
							}
							if(s.indexOf(a.charAt(i)) > s.indexOf(b.charAt(i)))
							{
								return 1;
							}
							else
							{
								return -1;
							}
						}
						return 0;
					}	
				};
				Arrays.parallelSort(str,myComp);
	}
	public static void main(String[] args) {
		
		String s = "fguecbdavwyxzhijklmnopqrst";
		String[] str = {"geeksforgeeks", "is", "the", "best",  
                "place", "for", "learning"};
		
		sort(str,s);
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i] + " ");
		}
	}

}
