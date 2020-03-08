import java.util.Scanner;

//Increment all the values of input
//Decrement only repeated values of input
//Print the remaining values' count
public class MakeAnagram {
	public static int numberNeeded(String first, String second) {
		int[] charSet = new int[256];
        
        for(int i=0; i<first.length(); i++)
            charSet[first.charAt(i)]++;
        
        for(int i=0; i<second.length(); i++)
            charSet[second.charAt(i)]--;
        
        int numberNeeded = 0;
        for(int i=0; i<256; i++)
            numberNeeded += Math.abs(charSet[i]);
        
        return numberNeeded;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first = in.next();
		String second = in.next();
		System.out.println(numberNeeded(first, second));
	}
}
