package Day3;

public class CountNegative2DMatrix {
     public int countNegatives(int[][] grid) {
        int row = 0;
        int col = grid[0].length-1;
        int count = 0;
        while(row<=grid.length-1 && col >= 0){
            if(grid[row][col] >= 0){
                row++;
            }
            else{
                count += grid.length-row;
                col--; 
            }
        }
        return count;
    
    }
}
