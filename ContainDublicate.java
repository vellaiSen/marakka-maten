package practice;

public class ContainDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,1,2,3,4,5};

boolean isDublicate =findDublicate(nums);
	System.out.println(isDublicate);
}
	

	private static boolean findDublicate(int[] nums) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<nums.length;i++)
		{
		for(int j=i+1;j<nums.length;j++)
			{
			//System.out.println(j);
			if(nums[i]==nums[j])
			{
				return true;
			}
			
			}	
	}
		return false;
}
}


