package basic;

import java.util.Arrays;

public class CountBits {
	
	 public static int[] countBits(int num) {
		 int[] count = new int[num+1];
		 count[0] = 0;
		 
	       for(int n=1;n<=num;n++){
	    	   int[] b = new int[100];
	    	   int i = 0;
	    	   int a = n;
	        	while(a>0){        		
	        		b[i] = a%2;
	        		a = a/2;
	        		i++;
	        	}
	        	for(int j=0;j<i;j++)
	        		if(b[j] ==1)
	        			count[n]++;
	       }
	       return count;
	 }
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(50)));

	}

}
