package basic;

public class IslandParameter {

	public static int islandPerimeter(int[][] grid) {
        int count = 0;
        for(int row = 0;row<grid.length;row++)
            for(int col = 0;col<grid[row].length;col++){
                if(grid[row][col] == 1){
                    count += 4;
                    
                    if(row!=0&&grid[row-1][col] == 1)
                        count --;
                    if(row!=grid.length-1&&grid[row+1][col] == 1)
                        count --;
                    if(col!=0 && grid[row][col-1] == 1)
                        count --;
                    if(col!=grid[row].length-1&&grid[row][col+1] == 1)
                        count --;
                }
            }
            
        return count;
    }
	
	
	
	public static void main(String[] args) {
		System.out.println(islandPerimeter(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));

	}

}
