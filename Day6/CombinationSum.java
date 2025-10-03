package Day6;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        combination(candidates,target,ll,ans,0);
        return ans;
    }
     public static void combination(int []coin,int amount,List<Integer>ll,List<List<Integer>>ans,int idx){
        if(amount==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<coin.length;i++){
            if(amount >=coin[i]){
                ll.add(coin[i]);
                combination(coin,amount-coin[i],ll,ans,i);
                ll.remove(ll.size()-1);
            }
        }
    }
}
