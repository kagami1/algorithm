package basic;

import java.util.Arrays;

public class MinimumMoves {
	
	public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        int mid = nums[nums.length/2];
        for(int n=0;n<nums.length;n++)
        	moves += Math.abs(mid - nums[n]);
        return moves;
        	
    }
	
	public static void main(String[] args){
		System.out.println(minMoves2(new int[]{1,2,3}));
		System.out.println(minMoves2(new int[]{1,6,4,3,2}));
	}
}
