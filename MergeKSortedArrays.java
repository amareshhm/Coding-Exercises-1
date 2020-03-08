import java.util.ArrayList;

public class MergeKSortedArrays {

	public static ArrayList<Integer> mergeKArrays(int[][] arrays, int k)
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int l;
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k;j++)
			{
				for(l=0;l<ar.size();l++)
				{
					if(arrays[i][j] < ar.get(l))
					break;
				}
				ar.add(l,arrays[i][j]);
			}
		}
		return ar;
	}
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(mergeKArrays(arr,arr.length));
	}

}
