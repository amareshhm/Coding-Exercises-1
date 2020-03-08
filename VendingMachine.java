public class VendingMachine {

	public static void main(String[] args) {
		int count = 0;
		int money = 523;
		while(money > 0)
		{
			if(money >= 1000)
			{
				count++;
				int numberOfThousands = money/1000;
				System.out.println("Thousand$ "+numberOfThousands);
				money -= 1000;
			}
			
			else if(money >= 500)
			{
				count++;
				int numberOfFiveHundreds = money/500;
				System.out.println("Five Hundred$ "+numberOfFiveHundreds);
				money -= 500;
			}
			else if(money >= 100)
			{
				count++;
				int numberOfHundreds = money/100;
				System.out.println("Hundred$ "+numberOfHundreds);
				money -= 100;
			}
			else if(money >= 50)
			{
				count++;
				int numberOfFifties = money/50;
				System.out.println("Fifty$ "+numberOfFifties);
				money -= 50;
			}
			else if(money >=10)
			{
				count++;
				int numberOfTens = money/10;
				System.out.println("Ten$ "+numberOfTens);
				money -= 10;
			}
			else if(money >=5)
			{
				count++;
				int numberOfFives = money/5;
				System.out.println("Five$ "+numberOfFives);
				money -= 5;
			}
			else if(money >=2)
			{
				count++;
				int numberOfTwos = money/2;
				System.out.println("Two$ "+numberOfTwos);
				money -= 2;
			}
			else if(money >=1)
			{
				count++;
				int numberOfOnes = money/1;
				System.out.println("One$ "+numberOfOnes);
				money -= 1;
			}
		}
		System.out.println("Number of notes: "+count);
	}

}
