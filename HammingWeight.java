package basic;

public class HammingWeight {

	public static int hammingWeight(int n){
		int result = 0;
		while(n !=0){
			int bit = n & 0x0001;
			result += bit;
			n = n >>1;
		}
		return result;
	}
	
	public static int hammingWeight2(int n){
		int result = 0;
		while(n !=0){
			n = n &(n-1);
			result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(hammingWeight(11));
		System.out.println(hammingWeight2(11));

	}

}
