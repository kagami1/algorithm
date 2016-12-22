package basic;

import java.util.Comparator;
import java.util.PriorityQueue;

class People
{
    public int h;
    public int k;
    public int i;   //index of this people in people[][]
    public People(int h, int k, int i)
    {
        this.h = h;
        this.k = k;
        this.i = i;
    }
}


public class PriorityQueueExample {
	
	public int[][] reconstructQueue(int[][] people){
		int[][] result = new int[people.length][people[0].length];
		if(people.length == 0)
			return result;
		
		PriorityQueue<People> pq = new PriorityQueue<People>(new Comparator<People>(){

			@Override
			public int compare(People arg0, People arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		return result;
	}
	
	
	public static void main(String[] args){
		
	}
}
