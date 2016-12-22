package basic;

public class FindTheDifference {

	public static char findTheDifference(String s, String t) {
        char result = 0;
        for(int n=0;n<s.length();n++)
            result = (char) (result^s.charAt(n));
        for(int n=0;n<t.length();n++)
            result = (char) (result^t.charAt(n));
        return result;
    }
	
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "abcde";
		
		System.out.println(findTheDifference(s1,s2));

	}

}
