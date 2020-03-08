import java.util.*;

class SemiPrime {
	@SuppressWarnings("resource")
	public static void main (String[] args) {
	    Scanner kb=new Scanner(System.in);
	    
	    int t=kb.nextInt();
	    int cnt=0;
	    for(int j=0;j<t;j++)
	    {int n=kb.nextInt();
	    cnt=0;
	    for(int i=2;i<n;i++)
	    while(n%i==0)
	    {
	        n/=i;
	        ++cnt;
	    }
	    if(n>1)
	    ++cnt;
	    //System.out.println(cnt);
	    
	    if(cnt!=2)
	    System.out.println("False");
		//code
		else
		System.out.println("True");
	}
	}
}