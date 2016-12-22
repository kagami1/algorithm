package basic;

import java.util.*;

public class GetRange {

	public static String[] getRange(int[] arr){
		List<String> list = new ArrayList<String>();

		int start = 0;
		int end = -1;
		
		for(int i=1;i<=arr.length;i++){
			if(i < arr.length && arr[i] - arr[i-1] == 1)
				end = i;
			
			else{
				String str = arr[start]+"";
				if(end != -1)
					str +="->"+arr[end];
				start = i;
				end = -1;
				list.add(str);
			}
		}
		String[] result = new String[list.size()];
		return list.toArray(result);
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getRange(new int[]{0,1,2,4,5,7})));
		System.out.println(Arrays.toString(getRange(new int[]{0,1,2,4,6,7,9,10})));
		System.out.println(Arrays.toString(getRange(new int[]{0,3,5,7,9})));
	} 

}
