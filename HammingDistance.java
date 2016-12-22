package basic;

public class HammingDistance {

	public static int hammingDistance(int x,int y){
		int dis = x^y;
        int result = 0;
        while(dis != 0){
            if((dis&0x1) ==1)
                result ++;
            dis = dis >>1;
        }
		return result;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(hammingDistance(1,7));
		System.out.println(hammingDistance(3,1));
		System.out.println(hammingDistance(93,73));

	}

}
