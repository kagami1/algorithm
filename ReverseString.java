package basic;

public class ReverseString {
	public static String ReverseString(String str)
	{
		String[] arr=str.split(" ");
		String temp="";
		for(int i=0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}

		return String.join(" ",arr);
	}
	
	public static void main(String args[]){
		System.out.println(ReverseString("I am come from china"));
	}

}
