package basic;

public class ArithmeticSlice {

	public static int getNums(int[] A){
		int result = 0;
		int addLast = 0;
		
		if(A.length <3)
			return result;
		
		for(int i=1;i<A.length-1;i++){
			if(A[i]-A[i-1] == A[i+1]-A[i]){
				addLast ++;
				result += addLast;
			}
			else
				addLast = 0;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNums(new int[]{1,2}));
		System.out.println(getNums(new int[]{1,2,3,4}));
		System.out.println(getNums(new int[]{1,2,3,4,5,6}));
		System.out.println(getNums(new int[]{1,2,4,5,6}));

	}

}
