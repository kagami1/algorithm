package basic;

import java.util.*;

public class FizzBuzz {
	
	public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%3!=0&&i%5!=0)
            	l.add(String.valueOf(i));
            else{
            	String str = "";
            	if(i%3 == 0)
            		str += "Fizz";
            	if(i%5 == 0)
            		str += "Buzz";
            	l.add(str);
            }
                
        }
        return l;
    }
	
	public static void main(String[] args){
		FizzBuzz fizz = new FizzBuzz();
		System.out.println(fizz.fizzBuzz(15));
	}
}
