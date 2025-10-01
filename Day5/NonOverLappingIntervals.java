package Day5;
import java.util.*;

public class NonOverLappingIntervals {

    public static void main(String[] args) {
        int intervals[][] = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
        
    }
    
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]); 
        return minRemoves(intervals);
    }

    public static int minRemoves(int[][] intervals) {
        int count = 1;  
        int k = 0;      

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[k][1]) { 
                k = i;
                count++;
            }
        }
        return intervals.length - count; 
    }
}
