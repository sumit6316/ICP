package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumII {
     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> set = new HashSet<>();
        findCombinations(candidates, set, target, new ArrayList<>(), 0);
        return new ArrayList<>(set);
    }

    private void findCombinations(int[] arr, Set<List<Integer>> set, int target, List<Integer> ll, int idx) {
        if (target == 0) {
            set.add(new ArrayList<>(ll));
            return;
        }

        if (idx >= arr.length || target < 0)
            return;

        findCombinations(arr, set, target, ll, nextDistinctIndex(arr, idx));

       
        if (arr[idx] <= target) {
            ll.add(arr[idx]);
            findCombinations(arr, set, target - arr[idx], ll, idx + 1);
            ll.remove(ll.size() - 1);
        }
    }

 
    private int nextDistinctIndex(int[] arr, int i) {
        int j = i + 1;
        while (j < arr.length && arr[j] == arr[i]) j++;
        return j;
    }
}
