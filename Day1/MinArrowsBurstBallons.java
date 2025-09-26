package ICP.Day1;

import java.util.Arrays;
import java.util.Comparator;

public class MinArrowsBurstBallons{
    public static void main(String[] args) {
        
    }

    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if(n==1){
            return 1;
        }
        Arrays.sort(points,new Comparator<int[]>(){
            public int compare(int a1[],int a2[]){
                if(a1[0]==a2[0]){
                    return 0;
                }
                if(a1[0]<a2[0]){
                    return -1;
                }
                return 1;
                // return a1[0]-a2[0];
            }
        });
        int arrows=1;
        int commonInterval[]=points[0];
        for(int i=1;i<n;i++){
            int curS = points[i][0];
            int curE = points[i][1];
            if(curS<=commonInterval[1]){
                commonInterval[0]=Math.max(commonInterval[0],curS);
                commonInterval[1]=Math.min(commonInterval[1],curE);
            }else{
                commonInterval[0]=curS;
                commonInterval[1]=curE;
                arrows++;

            }
        }
        return arrows;
    }
}