package Day3;

import java.util.HashMap;

public class LongestSubArraySumK {
    public static void main(String[] args) {
        
    }
    public int longestSubArray(int arr[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen,i+1);
            }
            int rem = sum - k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            map.put(sum,i);
        }
        return maxLen;



    }
}
