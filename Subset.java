package basic;

import java.util.Scanner;

public class Subset {
	public void build(int n){
		//生成数组
		int[] arr = new int[n];
		for(int i=0; i<n;i++){
			arr[i] = i+1;
}
		build(arr,new int[n], 0);
}

	private void build(int[] arr,int[] tag,int n){
		if(n==arr.length)//递归到最后一个元素
			{
			System.out.print("{");
				for(int i=0;i<arr.length;i++)
					if(tag[i] == 1)//只有当元素处于“出现”状态时，才打印
						System.out.print(arr[i]);				
					
				System.out.print("}");
				return;
}
				//每个元素都有两种状态:出现(1)或不出现(0)
				//递归调用
				tag[n]=0;
				build(arr,tag, n+1); 
				tag[n] =1;
				build(arr,tag,n+1);
}

	public static void main(String[] args){
		Subset s = new Subset();
		Scanner sc = new Scanner(System.in);
		s.build(sc.nextInt());
	}
}
