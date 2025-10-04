package Day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDecreasingSubsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> ll = new ArrayList<>();
        find(nums,set,ll,0);
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer>  item : set){
            ans.add(item);
        }
        return ans;
    }
    public void find(int []nums, Set<List<Integer>>res,List<Integer> ll ,int idx){
        if(idx==nums.length){
            if(ll.size()>=2){
                res.add(new ArrayList<>(ll));
            }
            return;
        }
        // not pick
        find(nums,res,ll,idx+1);

        //pick
        if(ll.size()==0 || ll.get(ll.size()-1)<=nums[idx]){
            ll.add(nums[idx]);
            find(nums,res,ll,idx+1);
            ll.remove(ll.size()-1); // backtarcking step
        }
}
}
