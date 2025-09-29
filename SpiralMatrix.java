package Day3;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] arr) {
        int minc=0,maxc=arr[0].length-1,minr=0,maxr=arr.length-1;
        int elements=arr.length*arr[0].length;
        List<Integer>result = new ArrayList<>();
        int c=0;
        while(c<elements){
            for(int i=minc;i<=maxc && c<elements;i++){
                result.add(arr[minr][i]);
                // System.out.print(arr[minr][i]+" ");
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr && c<elements;i++){
                result.add(arr[i][maxc]);
                // System.out.print(arr[i][maxc]+" ");
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc && c<elements;i--){
                result.add(arr[maxr][i]);
                // System.out.print(arr[maxr][i]+" ");
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr && c<elements;i--){
                result.add(arr[i][minc]);
                // System.out.print(arr[i][minc]);
                c++;
            }
            minc++;
        }return result;
    }
    
}
