package Day6;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(1, n, k, new ArrayList<>(), result);
        return result;
    }
    
    private void findCombinations(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
    
        for (int i = start; i <= n; i++) {
            current.add(i);                
            findCombinations(i + 1, n, k, current, result); 
            current.remove(current.size() - 1); 
        }
    } 
}
