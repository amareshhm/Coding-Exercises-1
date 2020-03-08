import java.util.*;

//Logic is to add the first,second.. element incrementally to the no of left rotations input
//and divide it by size of array to get the remainder, and print the corresponding array ele
//starting from beginning
//This is what we call IN ARRAY MANIPULATION
public class ArrayLeftRotation {
    
    @SuppressWarnings("resource")
	public static void main(String[] args) {
  
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int k = in.nextInt();
    	int a[] = new int[n];
    	for(int i=0;i<n;i++)
    	{
    		a[i] = in.nextInt();
    	}
    	System.out.println("Left rotation: ");
    	for(int i=0;i<n;i++)
    	{
    		System.out.print(a[(i+k)%n]+ " ");
    	}
    	System.out.println("\nRight rotation: ");
    	for(int i=0;i<n;i++)
    	{
    		System.out.print(a[(i+n-k)%n] + " ");
    	}	
    }
}