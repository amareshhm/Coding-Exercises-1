import java.util.LinkedHashMap;

public class PrintCharWithFreq {

	static void printCharWithFreq(String  str, int n)
	{
		LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<n;i++)
		{
			Integer j = lhm.get(str.charAt(i));
			
			System.out.println(j);
			if(j == null)
				lhm.put(str.charAt(i),1);
			else
				lhm.put(str.charAt(i),j+1);
		}
		
		for(Character c : lhm.keySet())
		{
			System.out.print("" +c+lhm.get(c)+" ");
		}
	}
	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		int n = str.length();
		
		printCharWithFreq(str,n);

	}

}
