public class IntegerToRomanNumber {

	//Mapping strategy is used
	public static String intToRoman(int num)
	{
		String[] thousands = new String[] {"","M","MM","MMM"};
		
		String[] hundreds = new String[] {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		
		String[] tens = new String[] {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		
		String[] units = new String[] {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		return thousands[num/1000] +
				hundreds[(num%1000)/100] +
				tens[(num%100)/10] +
				units[num%10];
	}
	public static void main(String[] args) {
		
		System.out.println(intToRoman(456));

	}

}
