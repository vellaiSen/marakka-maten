package practice;

public class RemoveDublicate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDublicate_Array arr = new RemoveDublicate_Array();
		int[] nums = {0,1,2,1,2,3,3,4,5};
	   arr.removeDublicate(nums);
	 
		
		//System.out.println(newIndex);
	}

	private int removeDublicate(int[] nums ) {
		// TODO Auto-generated method stub
		int newIndex = 1;
		for(int i=1;i<nums.length;i++)
		{
			if(nums[i-1]!=nums[i])
			{
				nums[newIndex]=nums[i];
				newIndex++;
			}
			//System.out.println(newIndex);
			
		}
		return newIndex;
		
		
	}

}
