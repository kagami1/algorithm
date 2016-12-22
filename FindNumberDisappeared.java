package basic;

import java.util.ArrayList;
import java.util.List;

public class FindNumberDisappeared {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int n=1 ; n<=nums.length;n++)
        	list.add(n);
        for(int n=0;n<nums.length;n++)
        	list.remove((Integer)nums[n]);
        return list;
    }
	
	public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int[] tem = new int[nums.length];
        for(int n=0 ; n<nums.length;n++)
        	tem[nums[n]-1] = nums[n];
        for(int n=0;n<nums.length;n++)
        	if(tem[n] == 0)
        		list.add(n+1);
        return list;
    }
	
	
	public static void main(String[] args) {
		List<Integer> list = findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
		for(Integer i :list)
			System.out.println(i);
		List<Integer> list2 = findDisappearedNumbers2(new int[]{4,3,2,7,8,2,3,1});
		for(Integer i :list2)
			System.out.println(i);

	}

}
