package Day6;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[101][101];
        for(int a[] : dp){
            Arrays.fill(a,-1);
        } 
        return mazePath(0,0,m-1,n-1,dp);
    }
    public static int mazePath(int cr,int cc,int er,int ec,int dp[][]){
        if(cc == ec && cr == er ){
            return 1;
        }
        if(cc>ec || cr>er){
            return 0;
        }
        if(dp[cr][cc] != -1){
            return dp[cr][cc];
        }
        int right = mazePath(cr,cc+1,er,ec,dp);
        int down = mazePath(cr+1,cc,er,ec,dp);
        return dp[cr][cc] = right+down;

    }
    
}
