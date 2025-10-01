package Day5;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int people[] = {1,2};
        int limit = 3;
        System.out.println(numRescueBoats(people,limit));
    }
    public static int numRescueBoats(int[] people, int limit) {
        return  find_boats(people,limit);
    }
    public static int find_boats(int weights[],int limit){
        Arrays.sort(weights);
        int count=0;
        int i=0;
        int j=weights.length-1;
        while(i <= j){
            int sum=weights[i]+weights[j];
            if(sum <= limit){
                count++;
                i++;
                j--;
            }else{
                count++;
                j--;
            }
        }return count;
    }
}
