package basic;

public class SingleNumber {
	
	public static int singleNumber(int[] nums){
		int length = nums.length;		
		int m = 0;
		
		for(int n=0;n<length;n++){
			for(m=0;m<length;m++){
				if(n == m)
					continue;
				if(nums[n] == nums[m])
					break;			
			}
			
			if(m == length)
				return nums[n];
		}
		
		return -1;
	}
	
	public static int singleNumber2(int[] nums){
		int result = nums[0];
		for(int n=1 ;n<nums.length;n++)
			result = result ^ nums[n];
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(singleNumber(new int[]{1,1,2,2,3,4,4,5,5}));
		System.out.println(singleNumber2(new int[]{1,1,2,2,3,4,4,5,5}));
	}
}
 