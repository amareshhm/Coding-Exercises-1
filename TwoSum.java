public class TwoSum {

	public static int[] twoSum(int[] nums,int target)
	{
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[j] == target - nums[i])
				{
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String[] args) {
		
		int[] num = {2,7,11,15};
		int[] result = TwoSum.twoSum(num,9);
		System.out.println(" "+result[0]+" "+result[1]);
		
	}

}
