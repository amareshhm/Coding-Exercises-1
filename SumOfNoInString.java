import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNoInString {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int cases = Integer.parseInt(br.readLine());
		while(cases-- > 0)
		{
			str = br.readLine();
			String[] s = str.split("\\D");
			int sum = 0;
			for(int i=0;i<s.length;i++)
			{
				if(!s[i].isEmpty())
				sum += Integer.parseInt(s[i]);
			}
			System.out.println(sum);
		}
	}

}
