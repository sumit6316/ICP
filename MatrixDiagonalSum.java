package Day3;

public class MatrixDiagonalSum {
     public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+= mat[i][j];
                }
                if((i+j)== (n-1)){
                    sum += mat[i][j];
                }
                // if(i==j && i+j == n-1){
                //     sum = sum - mat[i][j];
                // }
            }
        }
        if(n%2==0){
            return sum;
        }else{
            return sum - mat[n/2][n/2];
        }
        // return sum;
        
    }
}
