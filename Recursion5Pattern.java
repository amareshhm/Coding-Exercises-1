import java.util.Scanner;
public class Recursion5Pattern
 {
     static void loop(int n){
        if(n==0 || n<0){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        loop(n-5);
        System.out.print(n+" ");
        return;
     }
	@SuppressWarnings("resource")
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0){
	     int n=sc.nextInt();
	     loop(n);
	     System.out.println();
	 }
   }
}
