import java.io.BufferedReader;
import java.io.InputStreamReader;

class StringRotationBy2Places
{
	public static void main (String[] args) throws java.lang.Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	for(int i=0;i<t;i++)
	{
	String str1=br.readLine();
	String str2=br.readLine();
	String str3,str4;
	int n=str2.length();
	str3=str2.substring(n-2)+str2.substring(0,n-2);
	str4=str2.substring(2)+str2.substring(0,2);
	System.out.println(str3);
	System.out.println(str4);
    if((str1.equals(str3))||(str1.equals(str4)))
    System.out.println(1);
    else
    System.out.println(0);
    }
	}
}