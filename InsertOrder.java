package practice;

public class InsertOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		int target = 5;
		
InsertOrder io = new InsertOrder(); 

 io.findIndexPosition(nums,target);
	}

	private void findIndexPosition( int[] nums, int target) {
		// TODO Auto-generated method stub
		int inserPosition;
	for(int i=0;i<nums.length;i++)
	{
		int insertPosition;
		if(nums[i]==target)
			System.out.println("indexOfTraget is:"+i);
	}
		
		
	
		
	}

}
