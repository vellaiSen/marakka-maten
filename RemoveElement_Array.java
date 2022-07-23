package practice;

public class RemoveElement_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums = {0,2,3,6,1,5};

int target = 6;
int n = nums.length;
System.out.println("before deleting element:"+ n);

int len = removeElement(nums,6);
System.out.println("After deleting Element :"+ len);

	}

	private static int removeElement(int[] nums,int target) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[nums.length-1];
		int i=0;
		for(int j=0;j<nums.length;j++)
		{
			if(nums[j]!=target)
			{
				nums[i]=nums[j];
				i++;
			}
		
		}
		return i;
		
	}
		}
	
