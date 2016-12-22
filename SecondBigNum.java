package basic;

public class SecondBigNum {

	public static int foo(int[] arr){
		int max = arr[0];
		int second = arr[0];
		for(int n=1;n<arr.length ;n++)
			if(max<arr[n])
				max = arr[n];

		for(int n=1;n<arr.length ;n++)
			if(second<arr[n] && max !=arr[n])
				second =arr[n];
			
		
		return second;
	}
	
	public static void main(String[] args) {
		System.out.println(foo(new int[]{2,48,76,12,4,-4}));

	}

}
