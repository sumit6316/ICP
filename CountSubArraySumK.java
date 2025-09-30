package Day3;
import java.util.*;

public class CountSubArraySumK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(countSubArrays(arr, 3));
    }
    public static int countSubArrays(int arr[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int preSum = 0;
        map.put(0,1);
        int count = 0;

        for(int i=0;i<arr.length;i++){
            preSum += arr[i];
            int remove = preSum - k;
            if(map.containsKey(remove)){
                count+=map.get(remove);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;

    }
    
}
