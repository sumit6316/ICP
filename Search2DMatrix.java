package Day3;

public class Search2DMatrix {
    // O(log(m*n)) Binary Search
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int st = 0;
        int ed = (m*n)-1;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col]<target){
                st = mid+1;
            }else{
                ed = mid-1;
            }
        }
        return false;
        
    }
}
