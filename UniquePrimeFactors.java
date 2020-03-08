public class UniquePrimeFactors {

	public static long productPrimeFactors(int n)
	{
		long product = 1;
		for(int i=2;i<=n;i++)
		{
			//Checking if 'i' is factor of num
			if(n % i == 0)
			{
				//Checking if 'i' is a prime number
				boolean isPrime = true;
				for(int j=2;j<=i/2;j++)
				{
					if(i % j == 0)
					{
						isPrime = false;
						break;
					}
				}
				//condition if 'i' is prime number as well as factor of num
				if(isPrime)
				{
					product = product * i;
				}
			}
		}
		return product;
	}
	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(productPrimeFactors(n));

	}

}
