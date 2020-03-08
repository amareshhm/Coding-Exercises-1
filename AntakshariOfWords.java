import java.util.ArrayList;

//get the first word and store in temp
//compare if last letter of temp and first letter of next is same
//if yes, store in arraylist
//if no, loop again
public class AntakshariOfWords {

	public static ArrayList<String> AnthakshariOfWords(ArrayList<String> words) {

		ArrayList<String> al = new ArrayList<String>();
		String temp = words.get(0);
		al.add(temp);
		for (int i = 1; i < words.size(); i++) {
			for (int j = 1; j < words.size(); j++) {
				if (temp.charAt(temp.length() - 1) == words.get(j).charAt(0)) {
					al.add(words.get(j));
					temp = words.get(j);
					break;
				}
			}
		}
		return al;
	}
	
	public static void main(String[] args)
	{	
		ArrayList<String> words = new ArrayList<String>();
		words.add("mango");
		words.add("yellow");
		words.add("orange");
		words.add("emily");
		words.add("wind");
		System.out.println(AntakshariOfWords.AnthakshariOfWords(words));
		
	}
}