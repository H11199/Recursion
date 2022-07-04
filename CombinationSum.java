class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp  = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        helper(candidates, target, 0, temp, list);
        
        return list;
    }
    
    public void helper(int[] candidates, int target, int idx, List<Integer> temp, List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        
        if(target<0){
            return;
        }
        
        if(idx==candidates.length) return;
        
        helper(candidates, target, idx+1, temp, list);
        
        temp.add(candidates[idx]);
        helper(candidates, target-candidates[idx], idx, temp, list);
        temp.remove(temp.size()-1);
    }
}
