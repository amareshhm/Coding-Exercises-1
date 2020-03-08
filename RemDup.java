import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemDup {

	public static void main(String[] args) {
		
		List<Integer> primes = new ArrayList<Integer>();
		
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(7);
		primes.add(11);
		
		System.out.println("Primes: "+primes);
		
		Set <Integer> pwd = new LinkedHashSet<Integer>(primes);
		
		primes.clear();
		
		primes.addAll(pwd);
		
		System.out.println("list of primes without duplicates"+pwd);
	}

}
