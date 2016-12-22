package basic;

public class GetMax {
	public static int GetMax(int[] arr) throws Exception
	{
	if (arr == null )
	{
		throw new Exception("参数为空");
	}

	if (arr.length == 0)
	{
		throw new Exception("数组无数据");
	}

	int maxSofar = arr[0];
	int maxEnding = 0;
	
	for (int i = 0; i < arr.length; i++)
	{
		maxEnding = Math.max(maxEnding + arr[i], 0);
		maxSofar = Math.max(maxSofar, maxEnding);
	}

	return maxSofar;
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println(GetMax(new int[]{-12,-33,54,-3,5,0}));
	}
}
